package BaiThucHanh4;

public abstract class People {
    //Khởi tạo thuộc tính
    protected String name;
    protected int age;
    protected boolean gender;
    //Khởi tạo lớp trìu tượng
    public abstract String eat();
    public abstract String sleep();
    public abstract String study();

    public People(String name, int age,boolean gender ){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}
