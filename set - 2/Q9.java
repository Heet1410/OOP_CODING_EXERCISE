class Q9 {
    double a, b;

    Q9(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double area() {
        return a * b;
    }

    public static void main(String[] args) {
        Q9 r1 = new Q9(5,6);
        Q9 r2 = new Q9(3,7);

        if (r1.area() > r2.area())
            System.out.println("R1 bigger");
        else
            System.out.println("R2 bigger");
    }
}