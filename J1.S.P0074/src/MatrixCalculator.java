
public class MatrixCalculator {

    GetData getData = new GetData();
    MatrixOperations calculator = new MatrixOperations();

    void displayMenu() {
        System.out.println("======Caculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
    }

    void addMatrix() {
        System.out.println("--------- Addition ------------");
        // input matrix1
        int[][] matrix1 = getMatrix1();
        // input matrix2
        int[][] matrix2 = getMatrix2(matrix1, 1);
        // addition matrix
        int[][] result = calculator.addMatrix(matrix1, matrix2);
        // display result
        displayResult(matrix1, matrix2, result, 1);
    }

    void subMatrix() {
        System.out.println("--------- Subtraction ------------");
        // input matrix1
        int[][] matrix1 = getMatrix1();
        // input matrix2
        int[][] matrix2 = getMatrix2(matrix1, 2);
        // addition matrix
        int[][] result = calculator.subMatrix(matrix1, matrix2);
        // display result
        displayResult(matrix1, matrix2, result, 2);
    }

    void multiplyMatrix() {
        System.out.println("--------- Multiplication ------------");
        // input matrix1
        int[][] matrix1 = getMatrix1();
        // input matrix2
        int[][] matrix2 = getMatrix2(matrix1, 3);
        // addition matrix
        int[][] result = calculator.multiplyMatrix(matrix1, matrix2);
        // display result
        displayResult(matrix1, matrix2, result, 3);
    }

    int[][] getMatrix1() {
        int row = getData.getIntegerLimit("Enter Row Matrix 1:", 1, Integer.MAX_VALUE);
        int column = getData.getIntegerLimit("Enter Column Matrix 1:", 1, Integer.MAX_VALUE);
        int[][] matrix = new int[row][column];
        //  Loop first to last row of the matrices 
        for (int i = 0; i < row; i++) {
            // Loop first to last column of the matrices
            for (int j = 0; j < column; j++) {
                String mess = String.format("Enter Matrix1" + "[%d][%d]:", i + 1, j + 1);
                matrix[i][j] = getData.getMatrix(mess);
            }
        }
        return matrix;
    }

    int[][] getMatrix2(int[][] matrix1, int choice) {
        int[][] matrix2 = null;
        int rowM1 = matrix1.length;
        int colM1 = matrix1[0].length;
        int rowM2, colM2;
        // check case Multiplication 
        if (choice == 3) {
            do {
                rowM2 = getData.getIntegerLimit("Enter Row Matrix 2:", 1, Integer.MAX_VALUE);
                // check row2 equal or not column1 
                if (rowM2 != colM1) {
                    System.out.println("Row matrix 2 must be equal column matrix 1");
                    continue;
                }
                colM2 = getData.getIntegerLimit("Enter Column Matrix 2:", 1, Integer.MAX_VALUE);
                break;
            } while (true);
        } else {
            do {
                rowM2 = getData.getIntegerLimit("Enter Row Matrix 2:", 1, Integer.MAX_VALUE);
                // check row of matrix 2 not equal row of matrix 1
                if (rowM2 != rowM1) {
                    System.out.println("Row matrix 2 equal Row matrix 1, please!!");
                    continue;
                } else {
                    break;
                }
            } while (true);
            do {
                colM2 = getData.getIntegerLimit("Enter Column Matrix 2:", 1, Integer.MAX_VALUE);
                // check column matrix 2 equal column matrix 1
                if (colM2 != colM1) {
                    System.out.println("Column matrix 2 equal Column matrix 1, please!!");
                    continue;
                } else {
                    break;
                }
            } while (true);
        }
        matrix2 = new int[rowM2][colM2];
        //  Loop first to last row of the matrices 
        for (int i = 0; i < rowM2; i++) {
            // Loop first to last column of the matrices
            for (int j = 0; j < colM2; j++) {
                String mess = String.format("Enter Matrix2" + "[%d][%d]:", i + 1, j + 1);
                matrix2[i][j] = getData.getMatrix(mess);
            }
        }
        return matrix2;
    }

    void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        //  Loop first to last row of the matrices 
        for (int i = 0; i < row; i++) {
            // Loop first to last column of the matrices
            for (int j = 0; j < col; j++) {
                System.out.format("[%d]", matrix[i][j]);
            }
            System.out.println();
        }
    }

    void displayResult(int[][] matrix1, int[][] matrix2, int[][] result, int choice) {
        System.out.println("-----------------Result------------------");
        displayMatrix(matrix1);
        switch (choice) {
            case 1:
                System.out.println("+");
                break;
            case 2:
                System.out.println("-");
                break;
            case 3:
                System.out.println("*");
                break;
        }
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }

}
