public class Circle {
    private double radius = 1.0;
    private String color = "yellow";
    public Circle() {
    }
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }
    public String toString() {
        return "A Circle with radius = "+getRadius()
                +", and color is "+getColor()
                +", the Area is "+getArea()
                +", the Perimeter is "+getPerimeter();
    }
}
