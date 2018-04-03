/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshapes;

import static drawshapes.DrawShapes.randomDouble;
import static java.lang.Double.max;
import static java.lang.Double.min;

/**
 *
 * @author m
 */
public class Triangle extends CustomShape {

    private double a, b, c;

    public Triangle() {
        name = "треугольник";
        a = roundToDec(randomDouble(1, 10));
        b = roundToDec(randomDouble(1, 10));
        c = roundToDec(randomDouble(max(a, b) - min(a, b), max(a, b) - 1)); //a, b, c such that the larger of them is less than the sum of the other two

        setArea();
        area = roundToDec(area);
        data.add(new Information("Фигура", name));
        data.add(new Information("сторона A", Double.toString(a) + " ед."));
        data.add(new Information("сторона B", Double.toString(b) + " ед."));
        data.add(new Information("сторона C", Double.toString(c) + " ед."));
        data.add(new Information("площадь", Double.toString(area) + " кв.ед."));
    }

    private void setArea() {
        double halfP = (a + b + c) / 2;
        area = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }
}
