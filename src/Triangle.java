public class Triangle implements Shape{
    private int a;
    private int h;
    private String color;

    public Triangle(int a, int h, String color) {
        this.a = a;
        this.h = h;
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
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
        return "Triangle";
    }

    @Override
    public double getArea() {
        return Math.round((a / 2.0) * h);
    }

    @Override
    public String getColors() {
        return getColor();
    }
}
