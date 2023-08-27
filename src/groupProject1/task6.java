package groupProject1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // to determine the number is prime or not

        System.out.println("Enter a positive number that is greater than 1"); // any number that is 1 or less is not a prime number
        int num = scanner.nextInt();

        if (num > 1) {

            if (num == 2) {
                System.out.println(num + " is a prime number");
            }

            else if (num % 2 == 1 && ( (num % 3 == 1) || (num % 3 == 2))) {

                System.out.println(num + " is a prime number");
            }

            else {
                System.out.println(num + " not a prime number");
            }

        }

        else {
            System.out.println("Not a positive number");
        }



    }
}
