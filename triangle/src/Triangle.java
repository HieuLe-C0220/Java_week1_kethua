public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean checkTriangle() {
        if (this.side1 + this.side2 < this.side3 && this.side1 + this.side3 < this.side2 && this.side2 + this.side3 < this.side1) {
            return false;
        } else {
            return true;
        }
    }
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    public double getHeight() {
        double p = this.getPerimeter() / 2;
        return 2 * Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)) / side1;
    }
    public double getArea() {
        return this.getHeight() * side1 / 2;
    }
    public String toString() {
        return "This Triangle has 3 sides : "+this.side1
                +", "+this.side2
                +", "+ this.side3
                +", The Area = "+this.getArea()
                +", the Perimeter = "+this.getPerimeter()
                +" . "+super.toString();
    }
}