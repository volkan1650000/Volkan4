package Inheritance;

public class Sphere extends Formulas{
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume(){
        return Math.PI*radius*radius*radius*4/3;
    }
}
