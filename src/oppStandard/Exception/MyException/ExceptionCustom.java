package oppStandard.Exception.MyException;
//自定义的异常类
public class ExceptionCustom extends Exception{
    /**
     * 用户自定义异常类，只需继承Exception类即可
     *
     * 在程序中使用自定义异常类， 大体可以分为以下几个步骤：
     * 创建自定义异常类
     * 在方法中通过throw关键字抛出异常对象
     * 如果在当前抛出异常的方法中处理异常，可以使用try-catch语句捕获并处理；否则在方法的声明处通过throws关键字指明要抛出给方法调用者的异常，继续进行下一步操作.
     * 在出现异常方法的调用者中捕获并处理异常
     *
     */
    //传递数字 >10;
    private int detail;

    public ExceptionCustom(int a ) {
        this.detail = a;
    }
    //toString:异常的打印信息
    @Override
    public String toString() {
        return "ExceptionCustom{" +
                "detail=" + detail +
                '}';
    }
}
