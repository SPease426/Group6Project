package groupProject1;

public class task10 {
    public static void main(String[] args) {

        int [] arr = {10,10,45,30,45,100,56};
        String duplicateNums = "";

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; ++j) {

                if (arr[i] == arr[j]) {
                    duplicateNums = duplicateNums + " " + arr[i];
                }
            }
        }

        if (!(duplicateNums.isEmpty())) {
            System.out.println("The duplicated integers are" + duplicateNums);
        }

    }
}
