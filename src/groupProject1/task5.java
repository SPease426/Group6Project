package groupProject1;

public class task5 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("\n" + "Values a and b are switched");

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
