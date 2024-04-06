package support;

public class Arrays {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "First string";
        strings[1] = "Second string";
        strings[2] = "Third string";

        for(int i =0; i < strings.length; i++)
            System.out.println(strings[i]);

        System.out.println("---------------------");
        Object[] objects = new Object[3];
        objects[0] = "My string";
        objects[1] = 7;
        objects[2] = 9.5;

        for(int i =0; i < objects.length; i++)
            System.out.println(objects[i]);
    }
}
