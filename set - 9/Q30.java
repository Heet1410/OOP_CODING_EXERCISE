import java.util.*;

class Q30 {
    public static void main(String[] args) {

        String text = "java is easy and java is powerful";

        HashMap<String, Integer> freq = new HashMap<>();

        String[] arr = text.split(" ");

        for (String word : arr) {
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        System.out.println("Word Count:");
        System.out.println(freq);
    }
}