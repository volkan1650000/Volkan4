package Inheritance;

public class Cube extends Formulas{
    double length;

    Cube(double length){
        this.length = length;
    }

    @Override
    public double getVolume() {
        return length*length*length;
    }
}
