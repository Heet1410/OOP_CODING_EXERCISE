import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter meters: ");
            double m = input.nextDouble();

            double ft = m * 3.28084;
            System.out.println("Feet = " + ft);
        }
    }
}