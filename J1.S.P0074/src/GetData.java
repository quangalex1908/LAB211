
import java.util.Scanner;

public class GetData {

    int getIntegerLimit(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        // user input until correct
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine().trim());
                // check input
                if (min <= input && input <= max) {
                    return input;
                } else {
                    System.out.print("Enter again integer " + "[" + min + "," + max + "]" + ":");
                }
            } catch (NumberFormatException ee) {
                System.out.println("incorrect format!");
                System.out.print("Enter again integer " + "[" + min + "," + max + "]" + ":");
            }

        }
    }

    int getMatrix(String msg) {
        Scanner sc = new Scanner(System.in);
        String inputString;
        int inputInt;
        // user input until correct
        do {
            System.out.print(msg);
            inputString = sc.nextLine();
            // check empty
            if (inputString.isEmpty()) {
                System.out.println("input empty!");
                continue;
            } else {
                try {
                    inputInt = Integer.parseInt(inputString);
                    break;
                } catch (NumberFormatException ee) {
                    System.out.println("Value of matrix is digit");
                }

            }

        } while (true);
        return inputInt;

    }

    int getOption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice:");
        int min = 1;
        int max = 4;
        // user input until correct
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine().trim());
                if (min <= input && input <= max) {
                    return input;
                } else {
                    System.out.print("Enter again integer " + "[" + min + "," + max + "]" + ":");
                }
            } catch (NumberFormatException ee) {
                System.out.println("incorrect format!");
                System.out.print("Enter again integer " + "[" + min + "," + max + "]" + ":");
            }

        }
    }
}
