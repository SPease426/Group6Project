package GroupProject2;

class Square implements Shape {
    private double length;


    Square(double length) {
        this.length = length;
    }
    @Override
    public double calculateArea() {
        return length * 2;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }
}
