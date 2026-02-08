package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    /**
 * Rectangle класс - Shape interface-г хэрэгжүүлнэ
 * Битүүмжлэл сайжруулалт:
 * - private final талбарууд (мэдээлэл нууцлал)
 * - Shape interface хэрэгжүүлсэн
 */
    private final   double height;
    private final  double width;
     // PRIVATE FINAL - мэдээлэл нууцлал + өөрчлөгдөшгүй байдал
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    /**
     * Shape interface-ийн getArea() методыг хэрэгжүүлнэ
     */
    @Override
    public double getArea() {
        return height * width;
    }
}
