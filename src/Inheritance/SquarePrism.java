package Inheritance;

public class SquarePrism extends Formulas{
    double length;
    double oneSideOfTheSquare;

    SquarePrism(double oneSideOfTheSquare, double length){
        this.length = length;
        this.oneSideOfTheSquare = oneSideOfTheSquare;
    }

    @Override
    public double getVolume() {
        return oneSideOfTheSquare * oneSideOfTheSquare * length;
    }
}
