package oppStandard.inheritance.Super;

public class PersonSuper {
    protected String name = "chang";

    public PersonSuper() {
    }

    public PersonSuper(String name) {
        System.out.println("Person 无参执行了");
    }

    //私有的东西无法被继承！ private
    public void print(){
        System.out.println("Person");
    }
}
/**
 * super 的注意点
 * super 调用父类的构造方法，必须在构造方法的第一个
 * super必须只能出现在子类的方法或者构造方法中
 * super 和 this 不能同时调用构造方法
 * Vs this:
 *      代表的对象不同：
 *      this : 本身调用者这个对象
 *      super: 代表父类对象的引用
 *      前提 ：
 *      this ： 没有继承也可以使用
 *      super: 只能在继承条件下使用
 *      构造方法 ：
 *      this(); 本类的构造
 *      super(); 父类的构造
 */
/*
 public static void main(String[] args) {
        StudentSuper studentSuper = new StudentSuper();
        //studentSuper.test("圣体");
        //studentSuper.test1();


 */