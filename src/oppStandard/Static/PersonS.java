package oppStandard.Static;

public class PersonS {
    //2 创建对象时执行，然后执行构造方法
    //一般用来赋初始值
    {
        System.out.println("匿名代码块");
    }
    //1,最先执行，和类一起加载的，只执行一次
    static {
        System.out.println("静态代码块");
    }
    //3
    public PersonS() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        PersonS p1 = new PersonS();
        System.out.println("=======================================");
        PersonS p2 = new PersonS();
    }
}
