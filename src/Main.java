import com.bridgelabz.linecomparison.Line;
import com.bridgelabz.linecomparison.Point;

public class Main {
    public static void main(String[] args) {
        // Creating two lines with different endpoints
        Point p1 = new Point(2, 4);
        Point p2 = new Point(3, 7);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(6, 7);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        // Comparing lines using compareTo method
        int result = l1.compareTo(l2);

        // Printing the result of the comparison
        if (result == 0) {
            System.out.println("Both lines are equal in length.");
        } else if (result > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 2 is longer than Line 1.");
        }
    }
}
