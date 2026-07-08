public class MovieSeatReservation {
    static int getSeat(int index) {
        int[] seats = {101, 102, 103, 104, 105};

        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat position.");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getSeat(2));
        System.out.println(getSeat(8));
    }
}