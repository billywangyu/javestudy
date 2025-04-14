package method;

public class Demo01 {
    public static void main(String[] args) {
       int sum= add(2,3);
       double dsum=add(20.4,34.7);
        System.out.println(sum);
        System.out.println(dsum);

    }
    public static int add(int a,int b){
      return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
}
