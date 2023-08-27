package groupProject1;

public class task8 {
    public static void main(String[] args) {

        double[] numbers = {15.4,19,395.6,1000.5,1000.9, -200};

        double lowVal = numbers[0];
        double maxVal = numbers[0];

        for (int i = 0; i < numbers.length; ++i) {

            if (numbers[i] < lowVal) {

                lowVal = numbers[i];
            }

            else if (numbers[i] > maxVal) {
                maxVal = numbers[i];
            }
        }

        System.out.println("The highest value is " + maxVal);

        System.out.println("The lowest value is " + lowVal);
    }
}
