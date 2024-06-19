package oppStandard.polymorphism;

public class StudentPloy extends PersonPloy{
    @Override
    public void run() {
        System.out.println("son");
    }
    public void eat(){
        System.out.println("吃");
    }
}
/*
 public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new StudentSuper();
        //new PersonPloy();

        //可以指向的引用类型就不确定了:父类的引用指向子类
        StudentPloy s1 = new StudentPloy();//Student能调用的方法都是自己的或者继承父类的
        PersonPloy s2 = new StudentPloy();//Person 父类型，可以指向的子类，但不能调用子类型独有的方法！
        Object s3 = new StudentPloy();
        //对象能执行哪些方法，主要看对象左边的类型，和右边关系不大！

        s2.run();//子类重写了父类的方法：执行子类的方法; 如果没有重写则可以调用父类方法
        s1.run();
        s1.eat();
        ((StudentPloy) s2).eat();




    }
 */