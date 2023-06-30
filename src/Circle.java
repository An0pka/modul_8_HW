public class Circle implements Shape{
    private int r;
    private final double PI = Math.PI;
    private String color;

    public Circle(int r, String color) {
        this.r = r;
        this.color = color;
    }

    @Override
    public String toString() {
        return printNameShape();
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String printNameShape() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.round(PI*Math.pow(r, 2));
    }

    @Override
    public String getColors() {
        return getColor(); // must be Purple
    }
}
