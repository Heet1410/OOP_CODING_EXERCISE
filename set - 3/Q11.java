import java.util.Scanner;

class Q11 {
    String college;

    Q11(String c) {
        college = c;
    }

    class Student {
        String name, course;

        void read() {
            try (Scanner sc = new Scanner(System.in)) {
                name = sc.nextLine();
                course = sc.nextLine();
            }
        }

        void display() {
            System.out.println(college + " - " + name + " - " + course);
        }
    }

    public static void main(String[] args) {
        Q11 c = new Q11("ABC");
        Q11.Student s = c.new Student();

        s.read();
        s.display();
    }
}