package support;

import java.util.Scanner;

public class Assignments {

    public static void main(String[] args) {

        String testString = "This is our test string";
        print(testString);

        print(56);
        print(true);
        print("Hello" + "World");
        printResult(8,4,'+');
        printResult(9,4,'-');
        printResult(6,4,'*');
        printResult(24,4,'/');
        printResult(27,3,'%');

        comparison();
        multiCompare();
    }

    //Classwork - Exercise
    static void print(String str)
    {
        System.out.println(str);
    }

    static void print(int i)
    {
        System.out.println(i);
    }

    static void print(boolean b)
    {
        System.out.println(b);
    }

    static void print(String str1, String str2)
    {
        System.out.println(str1 + str2);
    }

    static void printResult(int x, int y, char ch)
    {
        switch (ch)
        {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '%':
                System.out.println(x % y);
                break;
            default:
                System.out.println(0);

        }
    }

    public static void comparison()
    {
        System.out.println(2 == 2);
        System.out.println(2 != 2);
        System.out.println(2 > 2);
        System.out.println(2 < 2);
        System.out.println(2 <= 2);
        System.out.println(2 >= 2);
    }

    public static void multiCompare()
    {
        System.out.println("--------Multi Comparison--------");
        System.out.println(2 == 2 && 2 != 3);
        System.out.println(2 == 2 || 2 != 3);
    }
}
