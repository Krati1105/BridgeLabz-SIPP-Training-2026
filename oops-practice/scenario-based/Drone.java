class Drone {
    int id;
    int bat;
    static String com = "Sky";

    Drone(int id, int bat) {
        this.id = id;
        this.bat = bat;
    }

    void start() {
        if (bat > 20)
            System.out.println("Start");
        else
            System.out.println("Low Battery");
    }

    void show() {
        System.out.println(com);
        System.out.println(id);
        System.out.println(bat);
    }

    public static void main(String[] args) {
        Drone d1 = new Drone(1, 80);
        Drone d2 = new Drone(2, 60);
        Drone d3 = new Drone(3, 10);

        d1.start();
        d2.start();
        d3.start();

        d1.show();
        d2.show();
        d3.show();
    }
}