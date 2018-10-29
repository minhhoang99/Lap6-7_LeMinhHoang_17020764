package Tuan6_7;

/**
 * Khai báo lớp trừu tượng Diagram và viết phương thức main
 *
 * @author LeMinhHoang
 */
public abstract class Diagram {

    /**
     * Xóa đối tượng thuộc lớp Circle
     *
     * @param x: đối tượng
     *
     * @return đối tượng sau khi xóa
     */
    public static Circle xoaCircle(Object x) {
        if (x instanceof Circle) {
            x = null;
        }
        return (Circle) x;
    }

    public static void main(String[] args) {

        Diagram circle = new Circle(3.0, 4.0, 7.0, true, true);
        System.out.println(circle.toString());
        System.out.println("********************");

        Diagram triangle = new Triangle(3.0, 4.0, 5.0, 6.0, 7.0, true, true);
        System.out.println(triangle.toString());
        System.out.println("********************");

        Diagram rectangle = new Rectangle(4.0, 5.0, 6.0, 7.0, true, true);
        System.out.println(rectangle.toString());
        System.out.println("********************");

        Diagram square = new Square(3.0, 4.0, 5.0, true, true);
        System.out.println(square.toString());
        System.out.println("********************");

        Diagram hexagon = new Hexagon(4.0, 5.0, 6.0, true, true);
        System.out.println(hexagon.toString());
        System.out.println("********************");

        circle = Diagram.xoaCircle(circle);
        if (circle == null) {
            System.out.println("Hình tròn đã được xóa!");
        }
        System.out.println("********************");

        triangle = Layer.xoaTriangle(triangle);
        if (triangle == null) {
            System.out.println("Tam giác đã được xóa!");
        }
        System.out.println("********************");

        Diagram layer = new Layer(true) {
        };
        
        System.out.println(layer.toString());
    }
}
