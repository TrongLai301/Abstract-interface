package BaiThucHanh4;

public class MainCheck {
    public static void main(String[] args) {
        StudentImpl student1= new StudentImpl("Trọng", 19, true);
        System.out.println(student1.eat());
        System.out.println(student1.study());
        student1.registerCourse("14");
        student1.attendClass();
    }
}
