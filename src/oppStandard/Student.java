package oppStandard;

//类 private:私有

/**
 * 封装的意义：
 * 提高程序的安全性，保护数据
 * 隐藏代码的实现细节
 * 统一接口
 * 提高系统的可维护性
 */
public class Student {
    //封装大多数是对属性来的，方法用不了多少封装

    //属性私有
    private String name;//名字

    private int id;//学号

    private char sex;//性别

    private int age;

    //提供一些可以操作这个属性的方法！
    //提供一些 public 的 get,set 方法
    //get 获得这个数据
    public String getName(){
        return this.name;
    }
    //set 给这个数据设置值（有时候set方法里会做一些安全性的验证和判断）
    public void setName(String name){
        this.name = name;
    }
    //  快捷方式 alt+insert
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            this.age = 3;
        }else {

            this.age = age;
        }
    }
}

//public class Student {
//    //属性： 字段
//    String name;//null
//    int age;//0
//
//    //方法
//    public void study (){
//        System.out.println( this.name + "在学习");
//    }
//}
/*
//类：抽象的， 实例化
        //类实例化后会返回一个自己的对象！
        //student 对象就是 Student 类的具体实例！

         //使用 new 关键字创建的时候，除了分配内存空间外，还会给创建好的对象进行默认的初始化以及对类中构造器的调用


Student chang = new Student();
        Student lucie = new Student();

        chang.name = "畅";
        chang.age = 25;
        lucie.name = "宝贝";
        lucie.age = 23;

        System.out.println(chang.name);
        System.out.println(chang.age);
        System.out.println(lucie.name);
        System.out.println(lucie.age);
 */
