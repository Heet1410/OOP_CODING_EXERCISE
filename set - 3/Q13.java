class Q13 {
    double a, b;

    void set(double x, double y) {
        a = x;
        b = y;
    }
}

class Tri extends Q13 {
    double area() {
        return 0.5 * a * b;
    }
}

class Rect extends Q13 {
    double area() {
        return a * b;
    }
}

class Main13 {
    public static void main(String[] args) {
        Tri t = new Tri();
        t.set(5,6);
        System.out.println(t.area());

        Rect r = new Rect();
        r.set(5,6);
        System.out.println(r.area());
    }
}