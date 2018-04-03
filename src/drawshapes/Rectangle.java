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
public class Rectangle extends CustomShape{
    
    private double a,b,perimeter;
    
    public Rectangle(){
        name = "прямоугольник";
        a = roundToDec(randomDouble(1, 10));
        b = roundToDec(randomDouble(1, 10));
        setArea();
        getPerimeter();
        data.add(new Information("Фигура", name));
        data.add(new Information("сторона А", Double.toString(a) + " ед."));
        data.add(new Information("сторона B", Double.toString(b) + " ед."));
        data.add(new Information("площадь", Double.toString(b) + " кв.ед."));
    }
    
    private void setArea(){
        area = roundToDec(a*b);
    }
    
    public double getPerimeter(){
        perimeter = 2*(a+b);
        return perimeter;
    }
    
}
