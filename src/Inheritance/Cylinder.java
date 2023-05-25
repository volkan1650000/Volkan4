package Inheritance;

public class Cylinder extends Formulas{
    double height;
    double radius;

     public Cylinder(double height,double radius){
        this.height = height;
        this.radius = radius;
     }

    @Override
    public double getVolume() {
        return Math.PI*radius*radius*height;
    }
}
