package array;

public class Demo01 {
    public static void main(String[] args) {
        // 变量的类型  变量的名字  =变量的值
        int[]  number;    //arrays define
        int sum=0;
        number = new int[10]; //创建一个数组   存放10个int数据
        for (int i = 1; i <=10; ++i) {
            for (int j = 0; j < 10; j++) {
                number[j] =i;
            }

            System.out.println(sum += number[i-1]);

        }
    }
}
