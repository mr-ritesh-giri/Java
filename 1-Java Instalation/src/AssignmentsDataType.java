public class AssignmentsDataType {
    public static void main(String[] args) {
        String fullName = "Ritesh Giri";
        byte age = 20;
        float height = 1.79f;
        char favouriteLetter = 'T';

        System.out.println("Name: " + fullName + ", Age: " + age + ", Height: " + height + "m, Favourite Letter: " + favouriteLetter);

        int num = 100;
        byte b = (byte) num;
        short s = (short) num;
        float f = (float) num;

        System.out.println("Integer: " + num + ", Byte: " + b + ", Short: " + s + ", Float: " + f );
    }
}
