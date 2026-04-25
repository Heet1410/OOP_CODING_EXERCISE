class MyEx extends Exception {
    MyEx(String s){ super(s); }
}

class Q22 {
    public static void main(String[] args) {
        try {
            throw new MyEx("Error");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}