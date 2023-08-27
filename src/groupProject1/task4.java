package groupProject1;

public class task4 {
    public static void main(String[] args) {
        int[][] numbers = {

                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11}
        };
        // Create the sizes for the arrays
        int evenSize = 0;
        int oddSize = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; ++j) {

                if (numbers[i][j] % 2 == 0) {
                    evenSize++;
                } else if (numbers[i][j] % 2 == 1) {
                    oddSize++;
                }
            }
        }

        // Split the 2D array into an array of even numbers and one array of odd numbers and assign them
        int[] evenNums = new int[evenSize];
        int[] oddNums = new int[oddSize];
        int evenInd = 0;
        int oddInd = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; ++j) {

                if (numbers[i][j] % 2 == 0) {
                    evenNums[evenInd] = numbers[i][j];
                    ++evenInd;
                }

                else if (numbers[i][j] % 2 == 1) {
                    oddNums[oddInd] = numbers[i][j];
                    ++oddInd;
                }
            }
        }
        System.out.print("The even numbers are ");
        for (int i = 0; i < evenNums.length; ++i) {
            System.out.print(evenNums[i] + " ");
        }
        System.out.println();

        // Create the sum of even numbers
        int evenSum = evenNums[0]; // initialize with first element

        for (int i = 1; i < evenNums.length; ++i) { // to avoid adding the same element twice in the for loop
            evenSum = evenSum + evenNums[i];
        }

        System.out.println("The sum of even numbers is " + evenSum + "\n");

        System.out.print("The odd numbers are ");
        for (int i = 0; i < oddNums.length; ++i) {
            System.out.print(oddNums[i] + " ");
        }
        System.out.println();

        // Create the sum of odd numbers
        int oddSum = oddNums[0]; // Initialize with first element

        for (int i = 1; i < oddNums.length; ++i) { // to avoid adding the same element twice in the for loop
            oddSum = oddSum + oddNums[i];
        }
        System.out.println("The sum of odd numbers is " + oddSum + "\n");


    }
}
