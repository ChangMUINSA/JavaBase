package oppStandard.inheritance.methodRewrite;
//重写都是方法的重写，和属性无关
public class A extends B{
    //重写
    @Override //注解：有功能的注释！
    public void test() {
        System.out.println("A=>test()");
    }
//    public static void test() {
//        System.out.println("A=>test()");
//    }

}
