import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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

    public double norme(){
        float x1 = point1.getX();
        float x2 = point2.getX();
        float y1 = point1.getY();
        float y2 = point2.getY();

        return sqrt(pow(x1-x2, 2) + pow(y1-y2, 2));
    }

    @Override
    public String toString(){
        return point1.toString() + " | " + point2.toString();
    }

    @Override
    //Renvoie true pour AB = AB, mais aussi pour AB = BA
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Segment2D segment2D = (Segment2D) o;

        if(! (point1.equals(segment2D.point1) || (point1.equals(segment2D.point2)))) return false;
        else return (point2.equals(segment2D.point2) || point2.equals(segment2D.point1));
    }

    public Point2D getPoint1() {
        return point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }
}
