package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
/**
 * Renderer класс - аливаа Shape дүрсийг зурах үүрэгтэй
 * 
 * Битүүмжлэл сайжруулалт:
 * 1. Rectangle биш Shape interface ашигласан
 * 2. private final - мэдээлэл нууцлал + immutability
 * 3. Text block ашигласан
 * 4. Polymorphism - ямар ч Shape-тэй ажиллана
 */

public class Renderer {
    // Shape interface ашигласан - Rectangle биш!
    private final   Shape shape;
    /**
     * Constructor - Shape interface хүлээн авна
     */
    
    Renderer(Shape shape) {
        this.shape = shape;
    }
    /**
     * Дүрсийг зурах метод
     */

    void draw() {
        double area = shape.getArea();

        // assume implementation
        // Text block ашигласан - Java 15+ синтакс

        System.out.println
            ("Shape printed" +
            "Its area is " + area);
    }
}
