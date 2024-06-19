package oppStandard.inheritance.Super;

public class StudentSuper extends PersonSuper{
    private String name = "宝贝";
    // 隐藏代码： 调用了父类的无参构造 super();
    //所以父类需要有一个无参构造存在
    //如不存在无参构造，则需要调用父类的有参构造 super("name");
    public StudentSuper() {
        //new PersonSuper("name");
        //super("name");//调用父类的构造器，必须要在子类构造器的第一行.
        this("hello");//调用带参构造器
        System.out.println("Student 无参执行了");
    }

    public StudentSuper(String s) {
        System.out.println("自己的构造方法");
    }

//    public StudentSuper(String name) {
//        super();
//        this.name = name;
//    }

    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();//Student
        this.print();//Student
        super.print();//Person

    }
    public void test(String name){
        System.out.println(name);//圣体
        System.out.println(this.name);//宝贝
        System.out.println(super.name);//chang
    }
}
