package array;

public class Sparse {
    public static void main(String[] args) {


        // 1. 创建原始二维数组（棋盘，0=空，1=黑子，2=白子）
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        chessArr[4][5] = 2;
        // 2. 遍历原始数组，统计非零数据个数
        int sum = 0;
        for (int[] row : chessArr) {
            for (int data : row) {
                if (data != 0) sum++;
            }
        }
        // 3. 创建稀疏数组（行数=sum+1，固定3列）
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = 11;   // 原数组行数
        sparseArr[0][1] = 11;   // 原数组列数
        sparseArr[0][2] = sum;  // 有效数据个数
        // 4. 填充稀疏数组（存储非零数据）
        int count = 0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;    // 行
                    sparseArr[count][1] = j;    // 列
                    sparseArr[count][2] = chessArr[i][j]; // 值
                }
            }
        }
        // 5. 打印稀疏数组
        System.out.println("稀疏数组：");
        for (int[] row : sparseArr) {
            System.out.printf("%d\t%d\t%d\n", row[0], row[1], row[2]);
        }
    }
}


