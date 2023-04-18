package BaiTap6_1;

public class Rectangle extends Shape {
    //Khởi tạo thuộc tính
    protected double width;
    protected double length;

    //Khởi tạo phương thức không tham số truyền vào
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }


    //Khởi tạo phương thức có tham số truyền vào
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //Khởi tạo phương thức có kế thừa từ lớp cha
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    //Khởi tạo getter và setter cho chiều dài và chiều cao


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLenght(double length) {
        this.length = length;
    }

    //Phương thức tính diện tích
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
    @Override
    public String toString() {
        return "A Circle with width= " + width + " and lengt" + length + ", which is a subclass of" + super.toString();
    }
}
