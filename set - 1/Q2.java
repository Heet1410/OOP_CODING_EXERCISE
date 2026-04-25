import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double d = sc.nextDouble();
            double e = sc.nextDouble();
            double f = sc.nextDouble();

            double det = a * e - b * d;

            if (det != 0) {
                double x = (c * e - b * f) / det;
                double y = (a * f - c * d) / det;

                System.out.println(x + " " + y);
            } else {
                System.out.println("No solution");
            }
        }
    }
}