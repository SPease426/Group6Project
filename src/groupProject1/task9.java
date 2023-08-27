package groupProject1;

import java.util.Arrays;

public class task9 {

    public static void main(String[] args) {

        int [] numbers = {10,12,50,12,60,62,-13,62};
        int largestNum = Arrays.stream(numbers).max().getAsInt();
        int secondLarge = numbers[0];
        int count = 0;

        for (int num : numbers) { // count how many times does the largest number repeat in the array

            if (num == largestNum) {
                count++;
            }
        }
        if (count > 1) {
            secondLarge = largestNum;

        }
        else {
            for (int num : numbers) {

                if (num < largestNum && num > secondLarge) {
                    secondLarge = num;
                }
            }
        }
        System.out.println(secondLarge + " is the 2nd largest number");
    }
}
