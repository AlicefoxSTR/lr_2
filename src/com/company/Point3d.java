package com.company;
public class Point3d extends Point2d {
    public static void main(String[] args) {
      //  Point3d myPoint = new Point3d();//создает точку (0,0,0)
      //  Point3d myOtherPoint = new Point3d(5, 3, 5);//создает точку (5,3,5)
       // Point3d myOtherPoint2 = new Point3d(5, 3, 5);//создает точку (5,3,5)
       // Point3d myOtherPoint1 = new Point3d(3, 5, 7);//создает точку (3,5,7)
    }
    private double zCoord;
    public static double distanceTo(Point3d s,Point3d g){
        double D=Math.sqrt(Math.pow(s.getX() - g.getX(),2)+Math.pow(s.getY() - g.getY(),2)+Math.pow(s.getZ() - g.getZ(),2));
        return D;
    }
    public Point3d ( double x, double y, double z) {
        super(x,y);
        zCoord = z;
    }
    public Point3d() {

        this(0, 0,0);
    }
    public double getZ () {
        return zCoord;
    }
    public void setZ (double val) {
        zCoord = val;
    }
    public boolean compare(Point3d p) {
        if ((super.getX() == p.getX()) && (super.getY() == p.getY()) && (this.getZ() == p.getZ()))
            return true;
        else
            return false;
    }
    public double distanceTo(Point3d p) {
        return Double.parseDouble(String.format("%.2f", Math.sqrt((Math.pow(p.getX() - super.getX(), 2) + Math.pow(p.getY() - super.getY(), 2) + Math.pow(p.getZ() - this.getZ(), 2)))).replace(',', '.'));
    }
}
