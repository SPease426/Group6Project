package GroupProject2;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circleObj = new Circle(3.2);
        Square box = new Square(3.5);

        System.out.println("The circle's area is " + circleObj.calculateArea() + " meters squared");
        System.out.println("The circle's perimeter is " + circleObj.calculatePerimeter() + " meters");
        System.out.println();

        System.out.println("The square's area is " + box.calculateArea() + " meters squared");
        System.out.println("The square's perimeter is " + box.calculatePerimeter() + " meters");

    }
}
