package net.switch_structure;

public class Demo01 {
    public static void main(String[] args) {
        //case 穿透
        char grade= 'b';
        switch (grade){
            case 'a':
                System.out.println("优秀");
                break;
            case 'b':
                System.out.println("良好");
                break;
            case 'c':
                System.out.println("及格");
                break;
            case 'd':
                System.out.println("不及格");
                break;
            default:
                System.out.println("错误");
        }
    }
}
