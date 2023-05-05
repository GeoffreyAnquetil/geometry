public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1,2);
        String p1String = p1.toString();
        System.out.println(p1String);

        Point2D p2 = new Point2D(1,2);
        Point2D p3 = new Point2D(2,2);

        Segment2D s1 = new Segment2D(p1, p2);
        Segment2D s2 = new Segment2D(p1, p3);
    }
}

