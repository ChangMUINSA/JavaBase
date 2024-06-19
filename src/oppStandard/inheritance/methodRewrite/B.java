package oppStandard.inheritance.methodRewrite;

public class B {
    public void test(){

        System.out.println("B=>test()");
    }
//    public static void test(){
//
//        System.out.println("B=>test()");
//    }
}
/**
 * 重写：需要有继承关系，子类重写父类的方法！
 * 方法名必须相同
 * 参数列表必须相同
 * 修饰符：范围可以扩大但不能缩小： public>protected>Default(什么都不写)>private
 * 抛出异常：范围，可以缩小，不能扩大 ClassNotFoundException---> Exception(大)
 * 重写，子类方法和父类必须要一致：方法体不同！
 * 为什么需要重写：
 * 父类的功能，子类不一定需要，或者不一定满足！
 * 快捷键 Alt+insert:override
 */
///*
//public static void main(String[] args) {
//        /**
//         * 静态方法和非静态方法区别很大
//         * 静态方法： 方法的调用只和左边，定义的数据类型有关
//         * 非静态方法： 重写
//         */
////方法的调用只和左边，定义的数据类型有关
//A a = new A();
//        a.test();//A
////父类的调用指向了子类
//B b = new A();// 子类重写了父类的方法
//        b.test();//B
/////**
//// * 有static时，b调用了B类的方法， 因为是用b类定义的
//// * 有static时，b调用的是对象的方法，因为是用b是用A类new的
//// */
//
//    }
// */
