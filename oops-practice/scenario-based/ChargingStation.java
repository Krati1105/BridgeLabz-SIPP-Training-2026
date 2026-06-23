class ChargingStation {
    static int total = 0;
    static double rate = 8;

    int id;
    double unit;

    ChargingStation(int id, double unit) {
        this.id = id;
        this.unit = unit;
        total++;
    }

    double bill() {
        return unit * rate;
    }

    void show() {
        System.out.println(id);
        System.out.println(unit);
        System.out.println(bill());
    }

    public static void main(String[] args) {
        ChargingStation a = new ChargingStation(1, 20);
        ChargingStation b = new ChargingStation(2, 30);
        ChargingStation c = new ChargingStation(3, 25);
        ChargingStation d = new ChargingStation(4, 40);
        ChargingStation e = new ChargingStation(5, 15);

        a.show();
        b.show();
        c.show();
        d.show();
        e.show();

        rate = 10;

        System.out.println("New Rate");

        a.show();
        b.show();

        System.out.println(total);
    }
}