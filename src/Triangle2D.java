import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Triangle2D {
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;

    public Triangle2D(Point2D point1, Point2D point2, Point2D point3) {
        if(point1.equals(point2) || point1.equals(point3) || point2.equals(point3)){
            System.err.println("Ce n'est pas un triangle valide ! (3 points différents)");
        }
        else{
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
        }
    }

    public double aire() {
        float x1 = point1.getX();
        float x2 = point2.getX();
        float x3 = point3.getX();
        float y1 = point1.getY();
        float y2 = point2.getY();
        float y3 = point3.getY();

        return 0.5 * abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
    }

    public boolean estIsocele(){
        Segment2D s1 = new Segment2D(point1, point2);
        Segment2D s2 = new Segment2D(point1, point3);
        Segment2D s3 = new Segment2D(point2, point3);

        double l1 = s1.norme();
        double l2 = s2.norme();
        double l3 = s3.norme();

        return l1 == l2 || l2 == l3 || l3 == l1;
    }

    public boolean estEquilateral(){
        Segment2D s1 = new Segment2D(point1, point2);
        Segment2D s2 = new Segment2D(point1, point3);
        Segment2D s3 = new Segment2D(point2, point3);

        double l1 = s1.norme();
        double l2 = s2.norme();
        double l3 = s3.norme();

        return l1==l2 && l2==l3;
    }

    public boolean estRectangle(){
        Segment2D s1 = new Segment2D(point1, point2);
        Segment2D s2 = new Segment2D(point1, point3);
        Segment2D s3 = new Segment2D(point2, point3);

        double l1 = s1.norme();
        double l2 = s2.norme();
        double l3 = s3.norme();

        if(l1>l2 && l1>l3 && (pow(l2,2) + pow(l3,2) == pow(l1,2))) return true;
        else if(l2>l1 && l2>l3 && (pow(l1,2) + pow(l3,2) == pow(l2,2))) return true;
        return (l3>l2 && l3>l1 && (pow(l2,2) + pow(l1,2) == pow(l3,2)));
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public Point2D getPoint3() {
        return point3;
    }

    public void setPoint3(Point2D point3) {
        this.point3 = point3;
    }
}
