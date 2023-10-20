
public class MatrixOperations {

    int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] result = new int[row][col];
        //  Loop first to last row of the matrices
        for (int i = 0; i < row; i++) {
            // Loop first to last column of the matrices
            for (int j = 0; j < col; j++) {
                // add matrix
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    int[][] subMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] result = new int[row][col];
        //  Loop first to last row of the matrices
        for (int i = 0; i < row; i++) {
            // Loop first to last column of the matrices
            for (int j = 0; j < col; j++) {
                // sub matrix
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int rowM1 = matrix1.length;
        int colM2 = matrix2[0].length;
        int rowM2 = matrix2.length;
        int[][] result = new int[rowM1][colM2];
        //  Loop first to last row of the matrices 1
        for (int i = 0; i < rowM1; i++) {
            // Loop first to last column of the matrices 2
            for (int j = 0; j < colM2; j++) {
                // Loop first to last row of the matrices 2
                for (int k = 0; k < rowM2; k++) {
                    // multiply matrix 
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

}
