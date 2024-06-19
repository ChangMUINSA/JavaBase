package oppStandard;

public class PersonCon {
    //存在一个 public PersonCon(){} 这样的空方法
    //即一个类什么都不写， 它也会存在一个方法（构造方法）
    /**
     * 构造方法的特点
     * 必须和类的名字相同
     * 必须没有返回类型，也不能写void
     * 注意点：定义了有参构造之后，如果想使用无参构造，需要显示的定义一个无参构造
     * this.name = name;
     *  this.代表当前的类的 ； name代表传进来的值
     */
    String name;
    //Alt+Insert 自动生成构造器
    //显示定义构造器(无参构造器)
    //实例化初始值
    //1.使用 new 关键字， 必须要有构造器， 本质是在调用构造器
    //2.用来初始化值
    public PersonCon(){
        this.name = "畅";
    }
    //有参构造 ： 一但定义了有参构造，无参就必须显示定义
    public PersonCon(String name){
        this.name = name;
    }
}
/*
public static void main(String[] args) {
        //new 实例化了一个对象
        PersonCon personCon = new PersonCon("好人卡");
        System.out.println(personCon.name);


    }

 */