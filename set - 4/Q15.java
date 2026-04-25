class Emp {
    void show() {
        System.out.println("Employee");
    }
}

class Manager extends Emp {
    void show() {
        System.out.println("Manager");
    }
}

class Main15 {
    public static void main(String[] args) {
        Emp e = new Emp();
        Emp m = new Manager();

        e.show();
        m.show();
    }
}