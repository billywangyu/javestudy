package net.switch_structure;

public class Demo02 {
    public static void main(String[] args) {
        String name= "刘德华";
        switch (name){
            case "刘德华":
                System.out.println("天王");
                break;
            case "张学友":
                System.out.println("歌神");
                break;
            default:
                System.out.println("屌丝");
        }
    }
}
