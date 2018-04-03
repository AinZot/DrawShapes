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
public class Trapeze extends CustomShape {

    private double a, b, c, h; // c - side of isosceles trapezoid, a & b - base lines 

    public Trapeze() {
        name = "трапеция";
        a = roundToDec(randomDouble(1, 10));
        b = roundToDec(randomDouble(1, a - 1));//not rectangle
        h = roundToDec(randomDouble(1, 10));
        setArea();
        getSide();
        data.add(new Information("Фигура", name));
        data.add(new Information("основание А", Double.toString(a) + " ед."));
        data.add(new Information("основание B", Double.toString(b) + " ед."));
        data.add(new Information("сторона", Double.toString(c) + " ед."));
        data.add(new Information("площадь", Double.toString(area)  + " кв.ед."));

    }

    private void setArea() {
        area = roundToDec(((a+b)*h)/2);
    }
    
    public final double getSide(){
        double smallLeg = (a-b)/2;//smaller leg
        double sqrSumm = smallLeg*smallLeg + h*h;
        c = roundToDec(Math.sqrt(sqrSumm));//Pythagorean theorem
        return c;
    }

}
