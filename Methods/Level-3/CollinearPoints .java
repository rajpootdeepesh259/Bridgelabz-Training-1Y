import java.util.Scanner;

public class CollinearPoints {

    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        double slopeAB = (x2 - x1) != 0 ? (double)(y2 - y1) / (x2 - x1) : Double.POSITIVE_INFINITY;
        double slopeBC = (x3 - x2) != 0 ? (double)(y3 - y2) / (x3 - x2) : Double.POSITIVE_INFINITY;
        double slopeAC = (x3 - x1) != 0 ? (double)(y3 - y1) / (x3 - x1) : Double.POSITIVE_INFINITY;

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3): ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Slope method).");
        } else {
            System.out.println("Points are NOT collinear (Slope method).");
        }

        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Area method).");
        } else {
            System.out.println("Points are NOT collinear (Area method).");
        }

        sc.close();
    }
}