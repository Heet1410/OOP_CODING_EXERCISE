class MyThread extends Thread {
    int start, end;

    MyThread(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

class Main24 {
    public static void main(String[] args) {
        try {
            MyThread t1 = new MyThread(1, 100);
            MyThread t2 = new MyThread(101, 200);
            MyThread t3 = new MyThread(201, 300);

            t1.start();
            t1.join(); // wait for t1

            t2.start();
            t2.join(); // wait for t2

            t3.start();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}