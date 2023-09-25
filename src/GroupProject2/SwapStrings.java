package GroupProject2;

public class SwapStrings {
    public static void main(String[] args) {
        String firstName = "Yuri";
        String lastName = "Lowenthal";

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println();

        firstName = firstName + lastName; // Swap strings
        lastName= firstName.substring(0, firstName.length() - lastName.length());
        firstName = firstName.substring(lastName.length());

        System.out.println("String variables are swapped");
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
