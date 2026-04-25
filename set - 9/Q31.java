import java.util.*;

class Q31 {
    public static void main(String[] args) {

        HashSet<Integer> values = new HashSet<>();

        values.add(15);
        values.add(25);
        values.add(15); // duplicate
        values.add(35);

        System.out.println("Unique elements:");

        for (Integer v : values) {
            System.out.println(v);
        }
    }
}