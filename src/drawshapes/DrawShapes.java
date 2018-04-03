/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshapes;

import java.util.Random;

/**
 *
 * @author m
 */
public class DrawShapes {

    static Random rand = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int maxCount;
        //Random rnd = ;        
        int maxCount = randomInt(1, 10);
        CustomShape[] shapes = new CustomShape[maxCount];

        for (int i = 0; i < maxCount; i++) {
            switch (randomShape()) {
                case "Circle":
                    shapes[i] = new Circle();
                    shapes[i].draw();
                    break;
                case "Triangle":
                    shapes[i] = new Triangle();
                    shapes[i].draw();
                    break;
                case "Trapeze":
                    shapes[i] = new Trapeze();
                    shapes[i].draw();
                    break;
                case "Rectangle":
                    shapes[i] = new Rectangle();
                    shapes[i].draw();
                    break;
                default:
                    System.out.println("Фигуры не существует");
                    break;
            }
        }
    }

    static int randomInt(int min, int max) {
        int rnd = rand.nextInt((max - min) + 1) + min;
        return rnd;
    }

    static double randomDouble(double min, double max) {
        double rnd = min + (max - min) * rand.nextDouble();
        return rnd;
    }

    static String randomShape() {
        int randIndex = randomInt(0, CustomShape.types.length - 1);
        return CustomShape.getType(randIndex);
    }

}
