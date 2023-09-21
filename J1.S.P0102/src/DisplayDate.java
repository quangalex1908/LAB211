
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DisplayDate {

    public static void main(String[] args) {
        String inputDate;
        boolean isDateExist;
        do {
            // step 1. User enter date with [dd/mm/yyyy] format 
            inputDate = inputDateWithFormat();  
            // step 2. Check user input date exits
            isDateExist = checkDateExist(inputDate);
        } while (isDateExist == false);
        // step 3. Determine day of week with input date
            displayDayOfWeek(inputDate);

    }

    private static String inputDateWithFormat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter date with format [dd/mm/yyyy]: ");
        // use loop check input format 
        while (true) {
            String inputDate = sc.nextLine();
            // use condition check format 
            // \\d{1,2} is a number have 1 or 2 digit
            // [/] is contain character / 
            // \\d{4} is a number have 4 digit 
            if (inputDate.matches("\\d{1,2}[/]\\d{1,2}[/]\\d{4}")) {
                return inputDate;
            } else {
                System.out.println("Input incorrect format");
                System.out.print("Please enter date with format [dd/mm/yyyy]: ");
            }
        }

    }

    private static boolean checkDateExist(String inputDate) {
        // declare date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // check date 
        dateFormat.setLenient(false);
        try {
            // swap date --> Strting
            dateFormat.parse(inputDate);
            // return
            return true;
        } catch (ParseException ex) {
            System.out.println("Date not exist");
            return false;
        }
    }

    private static void displayDayOfWeek(String inputDate) {
        // declare date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            //swap string --> date
            date = dateFormat.parse(inputDate);
            // swap date  --> string ( format EEEE)
            dateFormat = new SimpleDateFormat("EEEE");
            // display date
            System.out.print("Your day is ");
            System.out.println(dateFormat.format(date));
        } catch (ParseException ex) {
            // exception has been process in function checkDateExist
        }

    }

}
