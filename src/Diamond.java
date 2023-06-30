public class Diamond implements Shape{
    private int a;
    private double sin;
    private String color;

    public Diamond(int a, double sin, String color) {
        this.a = a;
        this.sin = Math.sin(sin);
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getSin() {
        return sin;
    }

    public void setSin(double sin) {
        this.sin = sin;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return printNameShape();
    }

    @Override
    public String printNameShape() {
        return "Diamond";
    }

    @Override
    public double getArea() {
        return Math.round(Math.pow(a, 2) * sin);
    }

    @Override
    public String getColors() {
        return getColor();
    }
}
