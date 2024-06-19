package oppStandard.Static;
//通过 final修饰的类不能被继承
public class StudentS extends PersonS {
    private static int age;//静态变量 多线程！
    private  double score;//非静态变量

    public void run(){
        go();//非静态方法可以去调用静态方法里面的所有东西

    }
    public static void go(){
        //run;//非静态方法不可以调用静态
    }

    public static void main(String[] args) {
        StudentS s1 = new StudentS();
        System.out.println(StudentS.age);
        System.out.println(age);
        //System.out.println(StudentS.score);
        System.out.println(s1.age);
        System.out.println(s1.score);
        new StudentS().run();
        StudentS.go();//静态可以调用静态
        go();//在同一个类中可以直接调用
    }
}
/*
{
        //代码块（匿名代码块）；没有名字，程序执行时不能主动调用
        //创造对象时就自动创建了，在构造期之前

    }
    static {
        //静态代码块
        //可以用来加载一些初始化的东西
        //类一加载就直接执行，永久只执行一次
    }

 */