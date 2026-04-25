import java.util.*;

class Q32 {
    public static void main(String[] args) {

        TreeSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(40);
        sortedSet.add(10);
        sortedSet.add(25);
        sortedSet.add(5);

        System.out.println("Sorted elements:");

        for (Integer val : sortedSet) {
            System.out.println(val);
        }
    }
}