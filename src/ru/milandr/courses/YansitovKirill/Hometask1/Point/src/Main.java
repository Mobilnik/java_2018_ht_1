
public class Main {

    public static void main(String[] args) {

        Point fi = new Point(0,0);
        Point se = new Point(0,0);
        Point empty = new Point();
        System.out.println(fi.getDistance(fi,se));
        fi.getLine(fi,se);
        empty.getCircle(fi, se);
        System.out.println("END");
    }
}
