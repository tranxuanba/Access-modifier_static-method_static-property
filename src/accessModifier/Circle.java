package accessModifier;

public class Circle {
    private double raduis = 1.0;
    private String color = "do";
    Circle() {
    }
    Circle(double raduis) {
        this.raduis = raduis;
    }
    public double getRadius() {
        return this.raduis;
    }
    public double getArea() {
        return this.raduis * this.raduis * Math.PI;
    }
}
