import java.util.*;

public class Calculator_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        ArrayList<String> history = new ArrayList<>();
        boolean running = true;

        System.out.println("Welcome to Practical Java Calculator!");

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Power (a^b)");
        System.out.println("7. Square Root");
        System.out.println("8. Cube Root");
        System.out.println("9. View History");
        System.out.println("0. Exit");

        while (running) {
            try {
                System.out.print("Enter your choice : ");
                int choice = sc.nextInt();

                double num1 = 0, num2 = 0, result = 0;
                String record = "";

                if (choice == 0) {
                    System.out.println("Calculator exited. Have a nice day!");
                    break;
                }

                if (choice == 9) {
                    System.out.println("Operation History:");
                    if (history.isEmpty()) {
                        System.out.println("No operations performed yet.");
                    } else {
                        for (String h : history) {
                            System.out.println("• " + h);
                        }
                    }
                    continue;
                }

                if (choice > 6 && choice < 9) {
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                } else if (choice >= 1 && choice <= 6) {
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                }

                switch (choice) {
                    case 1:
                        result = calc.add(num1, num2);
                        record = num1 + " + " + num2 + " = " + result;
                        break;
                    case 2:
                        result = calc.subtract(num1, num2);
                        record = num1 + " - " + num2 + " = " + result;
                        break;
                    case 3:
                        result = calc.multiply(num1, num2);
                        record = num1 + " * " + num2 + " = " + result;
                        break;
                    case 4:
                        result = calc.divide(num1, num2);
                        record = num1 + " / " + num2 + " = " + result;
                        break;
                    case 5:
                        result = calc.modulus(num1, num2);
                        record = num1 + " % " + num2 + " = " + result;
                        break;
                    case 6:
                        result = calc.power(num1, num2);
                        record = num1 + " ^ " + num2 + " = " + result;
                        break;
                    case 7:
                        result = calc.sqrt(num1);
                        record = "√" + num1 + " = " + result;
                        break;
                    case 8:
                        result = calc.cbrt(num1);
                        record = "∛" + num1 + " = " + result;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                System.out.println("Result: " + result);
                history.add(record);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                sc.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println("Math Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
