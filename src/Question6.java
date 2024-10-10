import java.util.Scanner;

public class Question6 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Volume Calculator");
        System.out.println("-----------------");
        System.out.println("1 - Find the volume of a sphere");
        System.out.println("2 - Find the volume of a Cylinder");
        System.out.println("Please choose an option: ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            volumeSphere();
        } else if (choice == 2) {
            volumeCylinder();
        }
    }
    static void volumeSphere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        double radius = Integer.parseInt(scanner.nextLine());

        double volume = (Math.pow(radius, 3)) * 4 / 3 * Math.PI;
        System.out.printf("Sphere volume: %.2f cubic units%n", volume);
    }
    static void volumeCylinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the Cylinder: ");
        double radius = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the height of the Cylinder: ");
        double height = Integer.parseInt(scanner.nextLine());

        double volume = Math.PI*Math.pow(radius, 2)*height;

        System.out.printf("Cylinder volume: %.2f cubic units%n", volume);
    }
}
