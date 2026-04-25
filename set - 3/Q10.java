class Q10 {
    String name;
    double balance;
    static double rate = 5;

    Q10(String n, double b) {
        name = n;
        balance = b;
    }

    void showInterest() {
        double interest = balance * rate / 100;
        System.out.println(name + " Interest: " + interest);
    }

    static void changeRate(double r) {
        rate = r;
    }

    public static void main(String[] args) {
        Q10 a = new Q10("A", 10000);
        a.showInterest();

        changeRate(10);
        a.showInterest();
    }
}