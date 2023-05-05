public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(0,4);
        Point2D p2 = new Point2D(3,0);
        Point2D p3 = new Point2D(3,4);
        Point2D p4 = new Point2D(1,4);

        Triangle2D t1 = new Triangle2D(p1,p2,p3);
        Triangle2D t2 = new Triangle2D(p4,p2,p3);

        if(t1.estRectangle()) System.out.println("t1 est rectangle");
        if(t2.estRectangle()) System.out.println("t2 est rectangle");

        System.out.println(t1.aire());
    }
}

