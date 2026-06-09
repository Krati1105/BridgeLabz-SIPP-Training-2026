import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height in centimeters: ");
        double cmHeight = sc.nextDouble();

        double inchHeight = cmHeight * 0.3937008; 
        double feetHeight = inchHeight * 12;       

        System.out.println("Your Height in cm is " + cmHeight + " while in feet is " + (float)feetHeight + " and inches is " + (float)inchHeight);

    }
}