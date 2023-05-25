package Inheritance;

public class TrianglePrism extends Formulas{
    double heightOfTriangle;
    double widthOfTriangle;
    double height;

    TrianglePrism(double heightOfTriangle, double widthOfTriangle, double height){
        this.heightOfTriangle = heightOfTriangle;
        this.widthOfTriangle = widthOfTriangle;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return heightOfTriangle*widthOfTriangle/2*height;
    }
}
