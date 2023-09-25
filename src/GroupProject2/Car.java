package GroupProject2;

public abstract class Car {
    protected double carPrice;
    private String color;

    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;

        System.out.println("The " + color + " car's original price is $" + carPrice + " dollars");
    }

    Car(String color, double carPrice) {
        this.carPrice = carPrice;
        this.color = color;

        System.out.println("The " + color + " car's original price is $" + carPrice + " dollars");
    }

    public abstract void calculateSalePrice();
}

class Truck extends Car {

    private double weight;
    Truck(double carPrice, String color, double weight) {
        super(carPrice,color);
        this.weight = weight;
        calculateSalePrice();
    }


    Truck(String color, double carPrice, double weight) {
        super(carPrice,color);
        this.weight = weight;
        calculateSalePrice();
    }

    Truck(double carPrice, double weight, String color) {
        super(carPrice,color);
        this.weight = weight;
        calculateSalePrice();
    }

    public void calculateSalePrice() {

        if (weight > 2000) {
            carPrice = carPrice - (carPrice * .10);
            carPrice = Math.round(carPrice);

            System.out.println("The weight of the car is over 2000 and so the car's gets a 10% discount");
            System.out.println("The price for the car is $" + carPrice + " dollars");

            System.out.println();
        }

        else {
            carPrice = carPrice - (carPrice * .20);
            carPrice = Math.round(carPrice);

            System.out.println("The weight of the car is less than 2000 and so the car's gets a 20% discount");
            System.out.println("The price for the car is $" + carPrice + " dollars");

            System.out.println();
        }
    }
}

class Sedan extends Car {
    private double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice,color);
        this.length = length;
        calculateSalePrice();
    }


    Sedan(String color, double carPrice, double length) {
        super(carPrice,color);
        this.length = length;
        calculateSalePrice();
    }

    Sedan(double carPrice, double weight, String color) {
        super(carPrice,color);
        this.length = length;
        calculateSalePrice();
    }

    public void calculateSalePrice() {

        if (length > 20) {
            carPrice = carPrice - (carPrice * .05);
            carPrice = Math.round(carPrice);

            System.out.println("The length of the car is greater than 20 and so the car's gets a 5% discount");
            System.out.println("The price for the car is $" + carPrice + " dollars");

            System.out.println();
        }

        else {
            carPrice = carPrice - (carPrice * .10);
            carPrice = Math.round(carPrice);

            System.out.println("The length of the car is less than 20 and so the car's gets a 10% discount");
            System.out.println("The price for the car is $" + carPrice + " dollars");

            System.out.println();
        }
    }

}
