public class Cylinder extends Circle {
    private double height = 1.5;
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    Cylinder() {
    }
    Cylinder(double radius,double height,String color) {
        super(radius, color);
        this.height = height;
    }
    public double getArea() {
        return super.getArea()*2+super.getPerimeter()*this.height;
    }
    public double getVolume() {
        return super.getArea()*this.height;
    }
    public String toString() {
        return "A Cylinder with radius = "+getRadius()
                +", height = "+getHeight()
                +", and color is "+getColor()
                +", the Area is "+getArea()
                +", the Volume is "+getVolume();
    }
}
