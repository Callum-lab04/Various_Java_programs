public class Question7 {
    public static void main(String [] args) {
        squareShape();
        System.out.println();
        rightHandedTriangleShape();
        System.out.println();
        pyramidShape();

    }
    static void squareShape() {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void rightHandedTriangleShape() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pyramidShape() {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
