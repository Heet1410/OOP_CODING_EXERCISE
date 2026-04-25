class BaseAcc {
    String name;
    double bal;

    BaseAcc(String n, double b) {
        name = n;
        bal = b;
    }
}

class SaveAcc extends BaseAcc {
    SaveAcc(String n, double b) {
        super(n,b);
    }

    void interest() {
        System.out.println(bal * 0.05);
    }
}

class FDAcc extends BaseAcc {
    FDAcc(String n, double b) {
        super(n,b);
    }

    void maturity() {
        System.out.println(bal * 1.1);
    }
}

class Main14 {
    public static void main(String[] args) {
        new SaveAcc("A",10000).interest();
        new FDAcc("B",10000).maturity();
    }
}