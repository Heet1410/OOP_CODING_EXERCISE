interface Div {
    String get(double avg);
}

class Q16 implements Div {
    public String get(double avg) {
        return avg >= 60 ? "First" : "Second";
    }

    public static void main(String[] args) {
        System.out.println(new Q16().get(70));
    }
}