package support;
import java.util.Scanner;
public class Java2Session {
    public static void main(String[] args) {

        int val = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        try
        {
            val = scanner.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("Error occured.");
        }

        checkNumber(val);
    }

    public static void checkNumber(int x)
    {
        if (x > 0)
        {
            System.out.println("This is a positive number.");

        }
        else if(x < 0)
        {
            System.out.println("This is a negative number");
        }
        else if (x == 0)
        {
            System.out.println("You entered zero");
        }
    }
}
