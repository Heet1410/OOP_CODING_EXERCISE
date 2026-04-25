import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().toLowerCase().charAt(0);

            String v = "aeiou";
            if (v.indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
    }
}