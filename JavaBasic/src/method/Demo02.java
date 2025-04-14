package method;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 number = new Demo02();
        number.test(1,2,67,234);
    }
    public void test(int... i){
        for (int x=0;x<i.length;x++){
            System.out.println(i[x]);
        }
    }
}
