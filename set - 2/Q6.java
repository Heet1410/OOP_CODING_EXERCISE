class Q6 {
    double w, h;

    Q6() {
        w = 1;
        h = 1;
    }

    Q6(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double area() {
        return w * h;
    }

    public static void main(String[] args) {
        Q6 r = new Q6(4, 5);
        System.out.println(r.area());
    }
}