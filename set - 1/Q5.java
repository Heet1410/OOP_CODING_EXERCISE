import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if (a + b > c && b + c > a && a + c > b) {
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
            } else {
                System.out.println("Invalid");
            }
        }
    }
}