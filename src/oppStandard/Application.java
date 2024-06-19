package oppStandard;

import oppStandard.InnerClass.Outer;
import oppStandard.Instanceof.PersonInstance;
import oppStandard.Instanceof.StudentInstance;
import oppStandard.Instanceof.TeacherInstance;
import oppStandard.abstractclass.AS;
import oppStandard.abstractclass.Action;
import oppStandard.inheritance.StudentInh;
import oppStandard.inheritance.Super.StudentSuper;
import oppStandard.inheritance.methodRewrite.A;
import oppStandard.inheritance.methodRewrite.B;
import oppStandard.polymorphism.PersonPloy;
import oppStandard.polymorphism.StudentPloy;

//一个项目应该只有一个 main 方法
public class Application {
    public static void main(String[] args) {
        //new
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();
    }

}
