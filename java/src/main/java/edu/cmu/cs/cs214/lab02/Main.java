package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
/**
 * Main класс - програм эхлэх цэг
 * Битүүмжлэл сайжруулалт: Shape interface ашигласан
 */

public  class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
