package oppStandard.abstractclass;
// abstract 抽象类 ：类 extends 单继承（局限性） 接口可以多继承
public abstract class Action {
    //约束~有人帮我们实现~
    //abstract 抽象方法，只有方法的的名字，没有方法的实现！
    public abstract void doSomething();
    /**
     * 不能 new 这个抽象类，只能靠子类去实现它： 约束！
     * 抽象类里可以写普通方法
     * 抽象方法必须在抽象类中
     * 抽象的抽象：约束
     */
    public Action() {
        System.out.println("抽象父亲");
    }
}
