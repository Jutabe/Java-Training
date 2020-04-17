package pl.banaszewski.lukasz;

import java.awt.geom.Area;

public class Main {

    public static void main(String[] args) {
        System.out.println("Circle area method results");
        System.out.println(AreaCalculator.area(10.023));
        System.out.println(AreaCalculator.area(-1.123));
        System.out.println();
        System.out.println("Rectangle area method results");
        System.out.println(AreaCalculator.area(1.23, 9.34));
        System.out.println(AreaCalculator.area(1.44, -2.34));
        System.out.println(AreaCalculator.area(-2.33, 9.31));
        System.out.println(AreaCalculator.area(0, 1));
        System.out.println();
        System.out.println("Examples of input/output");
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));
    }
}
