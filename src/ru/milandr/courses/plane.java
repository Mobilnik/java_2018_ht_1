package classes;


public class plane extends point{
    private point first_po;
    private point second_po;

    public plane(){
        first_po = new point();
        second_po = new point();
    }
    /*public plane(double x, double y){
        x_coor = x;
        y_coor = y;
    }*/

    public void create_first_point(double x, double y){
        first_po.setX_coord(x);
        first_po.setY_coord(y);
    }

    public void create_second_point(double x, double y){
        second_po.setX_coord(x);
        second_po.setY_coord(y);
    }

    public double find_distance(){
        double x1 = first_po.getX_coord();
        double y1 = first_po.getY_coord();
        double x2 = second_po.getX_coord();
        double y2 = second_po.getY_coord();

        double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return dist;
    }

    public double[] getLine(){
        double x1 = first_po.getX_coord();
        double y1 = first_po.getY_coord();
        double x2 = second_po.getX_coord();
        double y2 = second_po.getY_coord();
        double[] ret = new double[3];
        ret[0] = y1-y2;
        ret[1] = x2-x1;
        ret[2] = x1*y2-x2*y1;
        return ret;
    }

    public point middle(){
        double x1 = first_po.getX_coord();
        double y1 = first_po.getY_coord();
        double x2 = second_po.getX_coord();
        double y2 = second_po.getY_coord();
        point ret = new point((x2+x1)/2, (y2 + y1)/2);
        return ret;
    }

    public double[] getCircle(){
        double[] ret = new double[3];
        point mid = this.middle();
        ret[0] = mid.getX_coord();
        ret[1] = mid.getY_coord();
        double x1 = first_po.getX_coord();
        double y1 = first_po.getY_coord();
        ret[2] = Math.sqrt((x1-ret[0])*(x1-ret[0])+(y1-ret[1])*(y1-ret[1]));
        return ret;
    }

}
