package classes;

public class point {
    private double x_coord;
    private double y_coord;

    public point(){}

    public point(double x, double y){
        x_coord = x;
        y_coord = y;
    }

    public void setX_coord(double x_coord) {
        this.x_coord = x_coord;
    }

    public void setY_coord(double y_coord) {
        this.y_coord = y_coord;
    }

    public double getX_coord() {
        return x_coord;
    }

    public double getY_coord() {
        return y_coord;
    }
}
