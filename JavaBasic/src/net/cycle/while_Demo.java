package net.cycle;

/**
 * while循环结构演示类
 * 功能：
 *   1. 输出1-100的数字
 *   2. 计算1-100的累加和
 */
public class while_Demo {
    public static void main(String[] args) {
        // 示例1：输出1-100的数字
        int i = 1;  // 初始化计数器，从1开始更符合业务需求
        while (i <= 100) {
            System.out.println("当前数字: " + i);
            i++;    // 计数器递增（原代码将i++放在前面会导致先自增后输出，会输出2-101）
        }

        // 调用累加方法
        calculateSum();
    }

    /**
     * 计算1-100的累加和
     * 修正说明：
     *   1. 原方法缺少i++导致无限循环
     *   2. 输出逻辑优化，只在最后输出结果
     */
    public static void calculateSum() {
        int i = 1;      // 计数器
        int sum = 0;    // 累加器

        while (i <= 100) {
            sum += i;   // 累加当前值
            i++;        // 原代码缺少这行会导致无限循环
        }

        System.out.println("1-100的累加和: " + sum);  // 最终只输出一次结果
    }
}
