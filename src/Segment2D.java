public class Segment2D {
    private Point2D point1;
    private Point2D point2;

    public Segment2D(Point2D point1, Point2D point2) {
        if(point1.equals(point2)) System.err.println("Un segment ne peut pas avoir 2 points identiques !");
        else {
            this.point1 = point1;
            this.point2 = point2;
        }
    }



}
