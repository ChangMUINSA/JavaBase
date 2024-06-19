package oop;

public class MethodComplexUse {
    public static void main(String[] args) {
        //静态方法 static; 类名加方法名即可引用；
        //Student.say();
        //非静态方法 ; 需要实例化这个类 new
        Student student = new Student();
        student.say();
    }
    //类实例化之后才存在
    public void a(){
        b();

    }
    // static 代表和类一起加载的
    public static void b(){

    }
}
