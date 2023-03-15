package guru.qa;

public class PointMain {

    public static void main(String[] args) {

        Point moscow = new Point(45.8343, 10.3545, "Москва");
        Point london = new Point(55.1243, 19.3545, "Лондон");

        moscow.inverse();
        moscow.printSelf();

        int initArg = 42;
        moscow.setArg100(initArg);
        System.out.println(initArg);

        moscow.setCoordinate(london);
        london.printSelf();
    }
}
