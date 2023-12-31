public class Quad implements Shape{
    private int a;
    private String color;

    public Quad(int a, String color) {
        this.a = a;
        this.color = color;
    }
    @Override
    public String toString() {
        return printNameShape();
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
    public String printNameShape() {
        return "Quad";
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    public String getColors() {
        return getColor(); // must be Brown
    }
}
