package GroupProject2;
public class A extends Marks {
    private double mark1;
    private double mark2;
    private double mark3;
    private double total;
    private double gradedTotal;
    private int numMarks;

    A(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        numMarks = 3;
        gradedTotal = mark1 + mark2 + mark3;
        total = numMarks * 100;
    }

    @Override
    public void getPercentage() {
        double grade = (gradedTotal/total) * 100;
        System.out.println("Student B's grade percentage is " + Math.round(grade) + "%");
    }
}
