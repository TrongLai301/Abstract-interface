package BaiTap6_1;

public class Circle extends Shape  {
    protected double radius;
    //Khai báo phương thức không tham số truyền vào
    public Circle() {
        this.radius = 1.0;
    }

    //Khai báo phương thức có tham số truyền vào
    public Circle(double radius) {
        this.radius = radius;
    }

    //Khai báo phương thức có kế thừa từ lớp cha
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //Khởi tạo getter và setter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.pow(radius, 2) * 3.14;
    }
    @Override
    public double getPerimeter(){
        return (radius * 2) * 3.14;
    }
    @Override
    public String toString() {
        return "A Circle with radius= " + radius + ", which is a subclass of" + super.toString();
    }
}
