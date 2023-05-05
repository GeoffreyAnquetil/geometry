public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1,2);
        String p1String = p1.toString();
        System.out.println(p1String);

        Point2D p2 = new Point2D(1,2);
        Point2D p3 = new Point2D(2,2);
        Point2D p4 = new Point2D(3,3);

        Segment2D s1 = new Segment2D(p1, p3);
        Segment2D s2 = new Segment2D(p1, p3);
        Segment2D s3 = new Segment2D(p3, p1);
        Segment2D s4 = new Segment2D(p1, p4);

        if(s1.equals(s2)) System.out.println("s1 equals s2 avec : " + s1.toString() + s2.toString());
        if(s1.equals(s3)) System.out.println("s1 equals s3 avec : " + s1.toString() + s3.toString());
        if(s1.equals(s1)) System.out.println("s1 equals s1 avec : " + s1.toString() + s1.toString());
        if(s1.equals(s4)) System.out.println("s1 equals s4 avec : " + s1.toString() + s4.toString());

    }
}

