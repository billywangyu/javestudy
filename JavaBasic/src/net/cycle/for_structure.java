package net.cycle;

public class for_structure {
    public static void main(String[] args) {
        //  初始化值;  判断; 迭代
        for(int i=1; i<=100;i+=2){
            System.out.println("sum="+i);
        }
        System.out.println("cycle end");
        // for (; ; ) {}
        dome01();
        demo02();
        add99();
        enhance_for();
    }
    public static void dome01(){
        // 计算0到100之间的奇数和偶数的和
        int oddSum =0;
        int evenSum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i%2!=0){
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println("odd="+oddSum);
        System.out.println("even="+evenSum);
    }
    public static void demo02(){
        //输出1-1000之间能被5整除的数,并且每行输出3个
        for (int i = 1; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if(i%(15)==0){
                System.out.println();
                //System.out.println("\n");
            }
        }
        System.out.println();
    }
    public static  void add99(){
        //打印9*9乘法表
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+(j*i)+("\t"));
            }
            System.out.println();
        }
    }
    public static void enhance_for(){
        int[] x= {10,20,30,40}; //定义数组
        //遍历数组的元素
        for (double y:x){
            System.out.println(y);
        }
    }
}
