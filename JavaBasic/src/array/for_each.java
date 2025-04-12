package array;

public class for_each {
    public static void main(String[] args) {
        int[] number={1,2,4,7,34,25,54,23,};
        //增强的   JDK1.5 没有下标  只有每个元素的值
        for (int i : number) {
            System.out.println(i);
        }
        printArray(number);
        printArray(reverse(number));
    }
    //打印数组
    public static void printArray(int[] arrays){
        //普通的
        for (int i=0;i< arrays.length;i++){
            System.out.print(arrays[i]+"   ");
        }
    }
    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result= new int[arrays.length];
        for (int i=0,j=arrays.length-1;i<arrays.length;i++,j--){
            result[j] =arrays[i];
        }
        return result;
    }
}
