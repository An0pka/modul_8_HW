public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(12, "Purple");
        Shape quad = new Quad(10, "Brown");
        Shape triangle = new Triangle(9, 4, "Pink");
        Shape diamond = new Diamond(10, 45, "White");
        Shape hexagon = new Hexagon(7,  "Black");

        System.out.println(circle);
        System.out.println(circle.getColors());
        System.out.println(circle.getArea());
        System.out.println("#*#*#*#*#*#*#*#*#");
        System.out.println(quad);
        System.out.println(quad.getColors());
        System.out.println(quad.getArea());
        System.out.println("#*#*#*#*#*#*#*#*#");
        System.out.println(triangle);
        System.out.println(triangle.getColors());
        System.out.println(triangle.getArea());
        System.out.println("#*#*#*#*#*#*#*#*#");
        System.out.println(diamond);
        System.out.println(diamond.getColors());
        System.out.println(diamond.getArea());
        System.out.println("#*#*#*#*#*#*#*#*#");
        System.out.println(hexagon);
        System.out.println(hexagon.getColors());
        System.out.println(hexagon.getArea());
        System.out.println("#*#*#*#*#*#*#*#*#");

    }

}