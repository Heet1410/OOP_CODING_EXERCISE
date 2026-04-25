interface Pass {
    boolean ok(int m);
}

interface Div2 {
    String get(double avg);
}

class Q17 implements Pass, Div2 {
    public boolean ok(int m) { return m >= 35; }
    public String get(double avg) { return avg >= 60 ? "First":"Second"; }

    public static void main(String[] args) {
        Q17 r = new Q17();
        System.out.println(r.ok(40));
        System.out.println(r.get(70));
    }
}