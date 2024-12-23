import java.util.*;

class DataTypes{
    //  Take a and b with scanner input and add their sum
    public static  void main(String[] arguments){
    //  Finding Radius by taking radius as an input.
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double calc = 2 * 3.14 * radius;

//        System.out.println(calc);

//    Declaring variables for each data type.

        byte by = 1;
        int num = 9;
        float temp = 36.5f;
        double dug = 24.56;
        long moonDistance = 483489038409L;
        char car ='C';
        String name = "Ritesh";
        boolean isPresent = true;


        // Printing values
        System.out.println("Number: " + num);
        System.out.println("Temperature: " + temp);
        System.out.println("Temperature: " + moonDistance);
        System.out.println("Decimal value: " + dug);
        System.out.println("Character: " + car);
        System.out.println("Name: " + name);
        System.out.println("Is present: " + isPresent);
    }
}
