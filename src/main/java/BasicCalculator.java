import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("First number: " + firstNumber + "\n");

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Second number: " + secondNumber + "\n");

        while (true) {
            System.out.println("Select a following option:");
            System.out.println("=============================== ");
            System.out.println("(A)ddition ");
            System.out.println("(S)ubtraction ");
            System.out.println("(M)ultiplication");
            System.out.println("(D)ivision");
            System.out.println("Select the first character for your option");
            char selectedCalcuationOption = scanner.next().charAt(0);

            switch (selectedCalcuationOption) {
                case 'M':
                    double Multiplication = firstNumber * secondNumber;
                    System.out.println("Calculated: " + firstNumber + " * " + secondNumber + " = " + Multiplication);
                    return;

                case 'S':
                    double Subtraction = firstNumber - secondNumber;
                    System.out.println("Calculated: " + firstNumber + " - " + secondNumber + " = " + Subtraction);
                    return;

                case 'A':
                    double Addition = firstNumber + secondNumber;
                    System.out.println("Calculated: " + firstNumber + " + " + secondNumber + " = " + Addition);
                    return;
                case  'D':
                    double Division = firstNumber / secondNumber;
                    System.out.println("Calculated: " + firstNumber + " / " + secondNumber + " = " + Division);
                    return;
                default:
                    System.out.println("Invalid option. Please select again");
            }
            scanner.close();
        }
    }
}
