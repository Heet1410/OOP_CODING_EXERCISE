class Q8 {
    int x, y;

    Q8() { x = 0; y = 0; }
    Q8(int x, int y) { this.x = x; this.y = y; }
    Q8(Q8 p) { x = p.x; y = p.y; }

    void print() {
        System.out.println(x + "," + y);
    }

    public static void main(String[] args) {
        Q8 p1 = new Q8(2,3);
        Q8 p2 = new Q8(p1);
        p2.print();
    }
}