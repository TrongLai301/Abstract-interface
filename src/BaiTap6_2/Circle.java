package BaiTap6_2;

public class Circle implements GeometricObject {
    private double radius;
    //Khai báo phương thức không tham số truyền vào
    public Circle(double radius) {
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
    public String toString(){
        return "Circle [radius= "+radius+"]";
    }
}
