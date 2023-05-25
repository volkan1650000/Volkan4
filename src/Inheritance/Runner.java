package Inheritance;

public class Runner {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10,5);
        System.out.println(cylinder.getVolume());

        Sphere sphere = new Sphere(6.6);
        System.out.println(sphere.getVolume());

        Cube cube = new Cube(1.5);
        System.out.println(cube.getVolume());

        SquarePrism squarePrism = new SquarePrism(5,10);
        System.out.println(squarePrism.getVolume());

        TrianglePrism trianglePrism = new TrianglePrism(10.6,5,23.5);
        System.out.println(trianglePrism.getVolume());

        Cone cone = new Cone(5,7);
        System.out.println(cone.getVolume());

    }
}
