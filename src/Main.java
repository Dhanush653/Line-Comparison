import com.bridgelabz.linecomparison.Line;
import com.bridgelabz.linecomparison.Point;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(2, 4);
        Point p2 = new Point(3, 7);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(6, 7);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);


        double length1 = l1.calculateLength();
        double length2 = l2.calculateLength();
        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        if (l1.equals(l2)) {
            System.out.println("Both lines are equal in length.");
        } else {
            System.out.println("Lines are not equal in length.");
        }
    }
}
