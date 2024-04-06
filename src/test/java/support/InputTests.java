package support;

import java.util.Scanner;

public class InputTests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string: ");
        String sInput = scanner.nextLine();
        System.out.println("The string your entered is " + sInput);

        System.out.println("Type operand 1: ");
        String op1 = scanner.nextLine();
        System.out.println("Type operation (+, -, *, /): ");
        String operation = scanner.nextLine();
        System.out.println("Type operand 2: ");
        String op2 = scanner.nextLine();

        double result = 0;
        if (operation.equals("/") & op2.equals("0"))
        {
            System.out.println("Error: division by zero");
            return;
        }
        result = calculate(op1,op2,operation);
        printResult(result);

    }

    static double calculate(String str1, String str2, String operation)
    {
        double op1 = Double.parseDouble(str1);
        double op2 = Double.parseDouble(str2);
        double result = 0;
        switch (operation)
        {
            case "+":
                result = op1 + op2;
                break;
            case "-":
                result = op1 - op2;
                break;
            case "*":
                result = op1 * op2;
                break;
            case "/":
            {
                if (op2 == 0)
                    System.out.println("Division by 0 is not possible.");
                else
                    result = op1 / op2;
                break;
            }
            default:
                System.out.println("Not a supported operation.Please choose one of these(+, -, *,/)");
                break;
        }
        return result;
    }

    static void printResult(double result)
    {
        System.out.println("The result: " + result);
    }
}
