class BankAccount {
    int accNo;
    String name;
    double bal;
    static int total = 0;

    BankAccount(int accNo, String name, double bal) {
        this.accNo = accNo;
        this.name = name;
        this.bal = bal;
        total++;
    }

    void dep(double amt) {
        bal += amt;
    }

    void wd(double amt) {
        if (amt <= bal) {
            bal -= amt;
        } else {
            System.out.println("Low Balance");
        }
    }

    void show() {
        System.out.println(accNo + " " + name + " " + bal);
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount(101, "Aman", 5000);
        BankAccount b = new BankAccount(102, "Riya", 7000);
        BankAccount c = new BankAccount(103, "Karan", 9000);

        a.dep(500);
        a.wd(200);
        a.dep(300);
        a.wd(100);
        a.dep(400);

        b.dep(600);
        b.wd(500);
        b.dep(100);
        b.wd(200);
        b.dep(700);

        c.dep(1000);
        c.wd(500);
        c.dep(200);
        c.wd(100);
        c.dep(300);

        a.show();
        b.show();
        c.show();

        System.out.println("Total = " + total);
    }
}