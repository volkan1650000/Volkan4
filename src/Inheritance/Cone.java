package Inheritance;

public class Cone extends Formulas{
    double height;
    double radius;
    public Cone(double height,double radius) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI*radius*radius*height*1/3;
    }
}
