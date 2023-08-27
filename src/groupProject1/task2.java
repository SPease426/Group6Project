package groupProject1;

public class task2 {
    public static void main(String[] args) {

        int[] numbers = {25, 100, 25, 50, 400, 1600};
        int sum = 0;

        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
            sum = sum + numbers[i];

        }

        System.out.println();
        System.out.println("The sum of the numbers listed above is " + sum);
    }
}
