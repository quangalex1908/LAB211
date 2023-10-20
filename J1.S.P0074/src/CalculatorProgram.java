
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KimHo
 */
public class CalculatorProgram {

    public static void main(String[] args) {
        MatrixCalculator matrixCalculator = new MatrixCalculator();
        GetData getData = new GetData();
        int choice;
        do {
            // 1.Display a menu 
            matrixCalculator.displayMenu();
            // 2. users to select an option
            choice = getData.getOption();
            // Perform function based on the selected option
            switch (choice) {
                case 1:
                    // Addition matrixes
                    matrixCalculator.addMatrix();
                    break;
                case 2:
                    // Subtraction matrixes
                    matrixCalculator.subMatrix();
                    break;
                case 3:
                    // Multiplication matrixes
                    matrixCalculator.multiplyMatrix();
                    break;
                case 4:
                    // exit program
                    return;
            }
        } while (true);
    }

}
