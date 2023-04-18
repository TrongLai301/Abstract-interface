package BaiThucHanh4;

public class StudentImpl extends People implements Student {
    public StudentImpl (String name, int age, boolean gender){
        super(name, age, gender);
    }
    @Override
    public String eat(){
        return "Đang ăn";
    }
    @Override
    public String sleep(){
        return "Đang ngủ";
    }
    @Override
    public String study(){
        return "Đang học";
    }
    @Override
    public void registerCourse(String course){
        System.out.println("Đăng kí khóa: "+course );
    }
    @Override
    public void attendClass(){
        System.out.println("Đã đăng kí");
    }

}
