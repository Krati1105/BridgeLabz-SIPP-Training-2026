class Vehicle {
    String no;
    String name;
    String type;

    Vehicle(String no, String name, String type) {
        this.no = no;
        this.name = name;
        this.type = type;
    }

    static void car(Vehicle[] v) {
        for (Vehicle x : v) {
            if (x.type.equals("Car")) {
                System.out.println(x.no + " " + x.name);
            }
        }
    }

    static void bike(Vehicle[] v) {
        for (Vehicle x : v) {
            if (x.type.equals("Bike")) {
                System.out.println(x.no + " " + x.name);
            }
        }
    }

    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[10];

        v[0] = new Vehicle("DL1", "Aman", "Car");
        v[1] = new Vehicle("DL2", "Riya", "Bike");
        v[2] = new Vehicle("DL3", "Karan", "Car");
        v[3] = new Vehicle("DL4", "Neha", "Bike");
        v[4] = new Vehicle("DL5", "Rohit", "Car");
        v[5] = new Vehicle("DL6", "Pooja", "Bike");
        v[6] = new Vehicle("DL7", "Ankit", "Car");
        v[7] = new Vehicle("DL8", "Simran", "Bike");
        v[8] = new Vehicle("DL9", "Rahul", "Car");
        v[9] = new Vehicle("DL10", "Nisha", "Bike");

        car(v);
        bike(v);
    }
}