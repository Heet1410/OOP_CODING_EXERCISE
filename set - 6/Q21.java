class Q21 {
    static void check(int age) {
        if(age < 18) throw new RuntimeException("Not allowed");
    }

    public static void main(String[] args) {
        try {
            check(16);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}