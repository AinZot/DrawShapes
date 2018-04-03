/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshapes;

import static drawshapes.DrawShapes.randomDouble;

/**
 *
 * @author m
 */
public class Circle extends CustomShape {

    private double r;

    public Circle() {
        name = "круг";
        r = roundToDec(randomDouble(1, 10));
        setArea();
        area = roundToDec(area);
        data.add(new Information("Фигура", name));
        data.add(new Information("радиус", Double.toString(r) + " ед."));
        data.add(new Information("площадь", Double.toString(area) + " кв.ед."));

    }

    public double getRadius() {
        return r;
    }

    private void setArea() {
        double rad = getRadius();
        area = Math.PI * rad * rad;
    }

}
