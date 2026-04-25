class Q12 {

    double volume(double side) {
        return side * side * side;
    }

    double volume(double l, double w, double h) {
        return l * w * h;
    }

    double volumeSphere(double r) {
        return (4.0/3) * Math.PI * r*r*r;
    }

    public static void main(String[] args) {
        Q12 v = new Q12();

        System.out.println(v.volume(3));
        System.out.println(v.volume(2,3,4));
        System.out.println(v.volumeSphere(2));
    }
}