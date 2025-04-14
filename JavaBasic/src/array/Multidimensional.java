package array;

/**
 * 多维数组演示类
 * 演示二维数组的基本操作
 */
public class Multidimensional {  // 类名按照规范首字母大写
    public static void main(String[] args) {
        // 4行2列的二维数组
        /*
           array[0] → 1,2
           array[1] → 2,3
           array[2] → 3,4
           array[3] → 4,5
         */
        int[][] array = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };

        // 1. 直接访问特定元素
        System.out.println("array[0][0]: " + array[0][0]);  // 输出第一行第一列: 1
        System.out.println("array[0][1]: " + array[0][1]);  // 输出第一行第二列: 2

        // 2. 正确的嵌套循环遍历方式
        System.out.println("\n遍历整个二维数组:");
        for (int[] row : array) {         // 外层循环获取每一行（一维数组）
            for (int num : row) {         // 内层循环遍历当前行的每个元素
                System.out.print(num + " ");
            }
            System.out.println();         // 每行输出后换行
        }

        // 3. 传统for循环方式（备选方案）
        System.out.println("\n传统for循环遍历:");
        for (int i = 0; i < array.length; i++) {          // 遍历行
            for (int j = 0; j < array[i].length; j++) {   // 遍历列
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
