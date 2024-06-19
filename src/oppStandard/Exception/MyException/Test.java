package oppStandard.Exception.MyException;

public class Test {

    //可能会存在异常的方法
    static void test(int a) throws ExceptionCustom {
        System.out.println("传递的参数为： " + a);
        if (a >10) {
            throw new ExceptionCustom(a);//抛出
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (ExceptionCustom e) {
            //增加一些处理异常的代码块
            System.out.println("My Exception=>" + e);
        }
    }
}
