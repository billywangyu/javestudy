package net.cycle;

public class goto_structure {
    public static void main(String[] args) {
        outer: for (int i=100;i<=150;i++){
            for (int j=2;j<= Math.sqrt(i);j++){
                if(i%j==0){
                    continue outer;
                }
           }
            System.out.print(i+"  ");
        }
    }
}
