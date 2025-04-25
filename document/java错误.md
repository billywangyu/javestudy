## Java错误

### tyr catch finally



```java
package exception;

public class Demo01 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        //  try catch  finally 快捷健ctrl alt d

        try {
            System.out.print(a/b);
        } catch (Exception e) {
            System.err.println("error"); //自定义错误信息
//            throw new RuntimeException(e);  主动抛出异常
        } finally {
        }
    }
}
```

