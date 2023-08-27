package groupProject1;

public class task3 {
    public static void main(String[] args) {
        int[][] numbers = {

                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        for (int i = 0; i < numbers.length; ++i) {

            System.out.print("The even numbers of row " + (i+1) + " are ");

            for (int j = 0; j < numbers[i].length; ++j) {

                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}
