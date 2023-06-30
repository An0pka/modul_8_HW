public class Hexagon implements Shape{
    private int a;
    private String color;

    public Hexagon(int a, String color) {
        this.a = a;
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return printNameShape();
    }

    @Override
    public String printNameShape() {
        return "Hexagon";
    }

    @Override
    public double getArea() {
        return Math.round(((3.0 * Math.sqrt(3))/2.0)*Math.pow(a, 2));
    }

    @Override
    public String getColors() {
        return getColor();
    }
}
