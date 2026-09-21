//creat a point class to represent a point on a 2D coodinate system using constructor
public class Point {
    int x;
    int y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p = new Point(10, 20);

        p.display();
    }
}
