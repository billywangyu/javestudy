package net.scanner;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//从键盘接收数据
        int i =0;
        float f=0.0f;
        System.out.println("输入整数");
        if(scanner.hasNextInt()){
            i=scanner.nextInt();
            System.out.println("输入的整数为"+i);
        }else {
            System.out.println("输入是浮点数");
        }
        System.out.println("输入浮点数");
        if(scanner.hasNextFloat()){
            f=scanner.nextFloat();
            System.out.println("输入的浮点数为"+f);
        }else {
            System.out.println("输入是整数");
        }
        scanner.close();
    }
}
