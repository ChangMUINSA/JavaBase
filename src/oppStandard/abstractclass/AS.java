package oppStandard.abstractclass;
//抽象类的所有方法，继承了它的子类，都必须要实现它的方法；除非它的子类也是abstract则由子子类实现
public class AS extends Action{
    @Override
    public void doSomething() {

    }

    public AS() {
        super();
        System.out.println("抽象儿子");
    }

    public static void main(String[] args) {
        AS as = new AS();
        System.out.println(as);
    }
}
