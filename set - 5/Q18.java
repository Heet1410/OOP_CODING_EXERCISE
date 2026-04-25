abstract class Vehicle {
    abstract int wheels();
}

class Car extends Vehicle {
    int wheels() { return 4; }
}

class Bike extends Vehicle {
    int wheels() { return 2; }
}

class Main18 {
    public static void main(String[] args) {
        System.out.println(new Car().wheels());
        System.out.println(new Bike().wheels());
    }
}