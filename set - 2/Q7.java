import java.util.Scanner;

class Q7 {
    String name;
    double sal;

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            name = sc.nextLine();
            sal = sc.nextDouble();
        }
    }

    void show() {
        System.out.println(name + " " + sal);
    }

    public static void main(String[] args) {
        Q7 e = new Q7();
        e.input();
        e.show();
    }
}