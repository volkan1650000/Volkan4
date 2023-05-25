package Inheritance;

public class Cone extends Formulas{
    double height;
    double radius;

    public Cone(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.PI*radius*radius*height*1/3;
    }
}
