## MySql 避坑指南

### Linux

#### 安装

- ### **检查 MySQL 是否安装**

  运行以下命令检查是否安装了 MySQL：

  <BASH>

  ```
  mysql --version    # 检查是否安装which mysql        # 检查二进制路径
  ```

  - **如果报错 `mysql: command not found`** → MySQL 未安装。
  - **如果返回路径**（如 `/usr/bin/mysql`）→ MySQL 已安装，但服务未正确配置。

     

  1. **`mysql` 可执行文件存在**（`/usr/bin/mysql`）。

  2. **版本正确**（MySQL 8.0.41）。

  3. 但 `systemctl` 找不到 `mysql.service`

     ，可能是：

     - 服务名应该为 `mysqld`（某些情况下）。
     - MySQL 安装后未自动注册服务（Ubuntu 24.04 罕见但可能发生）。

- ### **手动查找 MySQL 服务名**

  在 Ubuntu 24.04 上，MySQL 服务的名字可能是：

  - **`mysql.service`**（标准名称）
  - **`mysqld.service`**
  - **`mariadb.service`**（如果混合安装了 MariaDB）

  运行以下命令查找：

  <BASH>

  ```
  sudo systemctl list-unit-files | grep -i mysql
  sudo systemctl list-unit-files | grep -i mariadb
  ```

  **如果输出为空**，表示 MySQL 服务未正确注册。

- ### **手动注册和启动 MySQL 服务**

  #### **（1）检查 MySQL 的 systemd 单元文件是否存在**

  <BASH>

  ```
  sudo ls /etc/systemd/system/mysql*
  sudo ls /lib/systemd/system/mysql*
  ```

  - **如果不存在**，需要手动创建。

  #### **（2）重新初始化 MySQL 并重新生成服务**

  <BASH>

  ```
  sudo mysql_install_db --user=mysql --ldata=/var/lib/mysql  # 重新初始化数据目录
  sudo systemctl daemon-reload   # 重新加载 
  systemdsudo systemctl start mysql     # 尝试启动
  ```

-  **终极解决方案：完全重装 MySQL**

  如果以上方法无效，**彻底卸载并重装 MySQL**：

  <BASH>

  ```
  # 1. 卸载 MySQLsudo apt purge mysql-server mysql-client mysql-common
  sudo rm -rf /etc/mysql /var/lib/mysql /var/log/mysql# 
  2. 清理残留sudo apt autoremove
  sudo apt autoclean# 
  3. 重新安装sudo apt update
  sudo apt install mysql-server# 
  4. 启动并检查sudo systemctl start mysql
  sudo systemctl status mysql
  ```

-  **验证 MySQL 是否正常运行**

  <BASH>

  ```
  mysql -u root -p          # 尝试登录
  sudo ss -tulnp | grep 3306  # 检查 3306 端口是否在监听
  ps aux | grep mysqld      # 检查进程
  ```
  
  如果 **成功登录或看到 `3306` 端口开放**，问题解决！

#### 登陆

- 如果 MySQL 正在运行，你会看到类似这样的输出（关键看 `:3306` 是否有 `LISTEN` 状态）：

  <TEXT>

  ```
  tcp   LISTEN 0  70    *:3306   *:*    users:(("mysqld",pid=12345,fd=25))
  ```

  ✅ **若有类似输出** → MySQL 正在运行，你可以直接连接：

  <BASH>

  ```
  sudo mysql -u root  # 初次登陆
  mysql -u root -p
  
  ```

- ### 首次安装后初始化密码（Linux/macOS

  ####  **无密码登录 MySQL**

  <BASH>

  ```
  mysql -u root
  ```

  #### **更新 root 密码（MySQL 5.7+）**

  <SQL>

  ```
  -- 先刷新权限
  FLUSH PRIVILEGES;
  ---MySQL 8.0+：如果插件是 caching_sha2_password
  ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '密码';
  ---MySQL 8.0+：如果插件是 mysql_native_password
  ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '密码';
  -- 再次刷新
  FLUSH PRIVILEGES;
  EXIT;
  ```

  #### **重启 MySQL 并验证**

  <BASH>

  ```
  sudo systemctl restart mysql
  mysql -u root -p  # 输入新密码测试
  ```

- ### **方法 2：通过 `mysql_secure_installation`（推荐）**

  运行安全安装脚本，会提示设置 root 密码和其他安全选项：

  <BASH>

  ```
  sudo mysql_secure_installation
  ```

  按提示操作：

  1. 输入当前密码（首次安装可能为空，直接回车）。
  2. 设置新密码。
  3. 移除匿名用户、禁用远程 root 登录等。

  ------

  ### **方法 3：直接修改密码（如果已能登录）**

  如果已能无密码登录，直接执行：

  <SQL>

  ```
  ALTER USER 'root'@'localhost' IDENTIFIED BY '新密码';
  FLUSH PRIVILEGES;
  ```

#### 建库

- #### 1. **创建数据库**

  首先在 MySQL 中手动创建数据库：

  <BASH>

  ```
  mysql -u root -p  # 登录 MySQL
  ```

  <SQL>

  ```
  -- 创建数据库（名称需与 application.properties 中一致）
  CREATE DATABASE clinic;-- 验证是否创建成功SHOW DATABASES;
  ```

  #### 2. **检查 Spring Boot 配置**

  确保 `application.properties` 或 `application.yml` 包含正确的数据库配置：

  **application.properties 示例**:

  <PROPERTIES>

  ```
  # MySQL 8.x 配置
  spring.datasource.url=jdbc:mysql://localhost:3306/clinicuseSSL=false&serverTimezone=UTC
  spring.datasource.username=root
  spring.datasource.password=你的密码
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  # Hibernate 配置
  spring.jpa.hibernate.ddlauto=update
  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
  ```

  **关键检查点**：

  - 数据库名 (`clinic`) 必须与创建的数据库一致
  - 用户名和密码要正确
  - MySQL 服务是否运行 (`sudo systemctl status mysql`)

  #### 3. **验证 MySQL 连接**

  手动测试连接是否正常：

  <BASH>

  ```
  mysql -u root -p -D clinic
  ```

  如果能成功连接，说明数据库服务正常。

