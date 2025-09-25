import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number.");
        String firstNumString = myScanner.nextLine();

        int firstNum = Integer.parseInt(firstNumString);

        System.out.println("Now enter the second number.");
        String  secondNumString = myScanner.nextLine();

        int secondNum = Integer.parseInt(secondNumString);

        System.out.println("Select the calculation you want: (pick Multiply this time)\n" +
                "Add\n" +
                "Subtract\n" +
                "Multiply\n" +
                "Divide");
        String calculation = myScanner.nextLine();

        if (calculation.equalsIgnoreCase("Multiply")) {
            int total = firstNum * secondNum;
            System.out.printf("%d multiplied by %d is %d", firstNum, secondNum, total);
        } else {
            System.err.println("Invalid option. Please choose Multiply this time.");
            calculation = myScanner.nextLine();
            if(calculation.equalsIgnoreCase("Multiply")) {
                int total = firstNum * secondNum;
                System.out.printf("%d multiplied by %d is %d", firstNum, secondNum, total);
            }

        }
    }
}
