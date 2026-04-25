class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("T1: " + i);
            try {
                Thread.sleep(1000); // 1 second
            } catch (Exception e) {}
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("T2: " + i);
            try {
                Thread.sleep(500); // 0.5 second
            } catch (Exception e) {}
        }
    }
}

class Main23 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();
    }
}