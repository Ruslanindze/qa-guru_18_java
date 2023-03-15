package guru.qa;

public class Point {
    private double pointX = 45.8343;
    private double pointY = 10.3545;
    private final String pointName;

//    public Point() {
//    }

    public Point(double pointX, double pointY, String pointName) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointName = pointName;
    }

    public Point inverse() {
        return new Point(pointY, pointX, pointName);
    }

    public void printSelf() {
        System.out.println("pointX: " + pointX + " pointY: " + pointY);
    }

    public void setArg100 (int arg) {
        arg = 100;
    }

    public void setCoordinate(Point arg) {
        arg.pointX = 0.0;
        arg.pointY = 0.0;
    }
}
