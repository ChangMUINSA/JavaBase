package oop;
// 对象，内存！
public class SecondPropagation {
    public static void main(String[] args) {
        //引用传递： 对象，本质还是值传递
        Person person = new Person();
        Person person1 = new Person();
        System.out.println(person.name);//null
        System.out.println("=================================================");
        SecondPropagation.changedName(person);
        System.out.println(person.name);//畅
        System.out.println("==================================================");
        System.out.println(person1.name);

    }
    public static void changedName(Person person){
        //person 是一个对象： 指向的 ---> Person person = new Person();这是一个具体的人，可以改变属性！
        person.name = "畅";
        //String person5 ="畅";
    }
}
// 定义了一个 Person 类，有一个属性： name
class Person{
    String name;//null
}
