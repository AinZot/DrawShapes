/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshapes;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author m
 */
public class CustomShape {

    String name;
    String color;
    double area;

    final static String[] types = {"Triangle", "Circle", "Rectangle", "Trapeze"};
    final static String[] colors = {"красный", "зеленый", "голубой", "белый", "желтый", "фиолетовый"};

    List<Information> data = new ArrayList<>();

    CustomShape() {
    }

    void draw() {
        setColor();
        for (int i = 0; i < data.size(); i++) {
            if (i != data.size() - 1) {
                System.out.print(data.get(i).property + ": " + data.get(i).value + ", ");
            } else {
                System.out.print(data.get(i).property + ": " + data.get(i).value + ";\n");
            }
        }
    }

    static String getType(int index) {
        return types[index];
    }

    void setColor() {
        int rnd = DrawShapes.randomInt(0, colors.length - 1);
        data.add(new Information("цвет", colors[rnd]));
    }

    final double roundToDec(double toRound) {
        return Math.round(toRound * 10d) / 10d;
    }

}
