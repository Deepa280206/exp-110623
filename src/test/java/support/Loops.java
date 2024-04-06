package support;

public class Loops {
    public static void main(String[] args) {

//        boolean condition = true;
//        while (condition)
//        {
//          condition = false;
//        }
//
//        int x = 0;
//        while( x < 10)
//        {
//            System.out.println("The value of x: " + x);
//            x++;
////            Thread.sleep(500);
//        }
//
//        System.out.println("========================");
//        for(int y=0; y < 10;y++)
//            System.out.println("The value of y is: " + y);

//        String[] strings = new String[5];
//        strings[0] = "1";
//        strings[1] = "2";
//        strings[2] = "3";
//        strings[3] = "4";
//        strings[4] = "5";
//
//        for (int i =0; i < strings.length; i++)
//            System.out.println("Array value: " + strings[i]);

        String[] strings = new String[]{"Test", "One", "Portnov", "100"};
        for (int i = 0; i < strings.length;i++)
        {
            if (strings[i].equals("Portnov"))
                System.out.println("MATCH");

        }
        System.out.println("=============");

        int x = 10;
        while (x >= 1) {
            System.out.println(x);
            x--;
        }
    }
}
