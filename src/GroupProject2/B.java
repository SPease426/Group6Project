package GroupProject2;

public class B extends Marks {
    private double mark1;
    private double mark2;
    private double mark3;
    private double mark4;
    private double total;
    private double gradedTotal;
    private int numMarks;

    B(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        numMarks = 4;
        gradedTotal = mark1 + mark2 + mark3 + mark4;
        total = numMarks * 100;
    }
    @Override
    public void getPercentage() {
        double grade = (gradedTotal/total) * 100;
        System.out.println("Student B's grade percentage is " + Math.round(grade) + "%");
    }
}
