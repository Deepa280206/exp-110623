package support;

public class JavaPractice {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(999);

        String label = "The result: ";
//        int x = 10;
//        int y = 7;
        System.out.println(label + (x() + y()));
        printResult(7,8);
   }

   static int x()
   {
       return 10;
   }

   static int y()
   {
       return 7;
   }

   static void printResult(int x, int y)
   {
       System.out.println(x + y);
   }
}
