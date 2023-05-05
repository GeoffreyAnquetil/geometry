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

    public boolean estIsocele(){
        Segment2D s1 = new Segment2D(point1, point2);
        Segment2D s2 = new Segment2D(point1, point3);
        Segment2D s3 = new Segment2D(point2, point3);

        return s1.equals(s2) || s2.equals(s3) || s3.equals(s1);
    }

    public boolean estEquilateral(){
        Segment2D s1 = new Segment2D(point1, point2);
        Segment2D s2 = new Segment2D(point1, point3);
        Segment2D s3 = new Segment2D(point2, point3);

        return s1.equals(s2) && s2.equals(s3);
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
