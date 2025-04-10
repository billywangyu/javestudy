package net.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //输入多个数,求和和平均数,每输入一个数回车确认,
        // 通过输入非数字来结束输入并输出结果
        Scanner scanner=new Scanner(System.in);
        //和
        double sum=0;
        //输入计数器
        int conant=0;
        //通过循环判断是否还有输入,在对每一次进行求和和统计
        while(scanner.hasNextDouble()){
            double x =scanner.nextDouble();
            conant++;
            sum+= x;
        }
        System.out.println("个数的和是:"+sum);
        System.out.println("个数的平均数是:"+(sum/conant));

        scanner.close();
    }
}
