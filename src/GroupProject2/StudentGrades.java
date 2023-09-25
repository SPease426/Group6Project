package GroupProject2;

public class StudentGrades {

    public static void main(String[] args) {
        Marks studentA = new A(89.5, 94.3, 95.3);
        Marks studentB = new B(93.5, 92.75, 87.64, 94.8);

        studentA.getPercentage();
        studentB.getPercentage();
    }
}
