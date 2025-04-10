package net.cycle;

public class do_while {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        do {
            sum+=i;
            i++;
        }while (i<=100);
        System.out.println("sum="+sum);
        System.out.println(i);
    }
}
