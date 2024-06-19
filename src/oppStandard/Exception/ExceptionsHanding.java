package oppStandard.Exception;

public class ExceptionsHanding {
    /**
     * 抛出异常
     * 捕获异常
     *
     * 异常处理五个关键字：try,catch,finally,throw,throws
     */
    /**
     * 实际应用中的经验总结
     * 处理运行异常时，采用逻辑去合理规避同时辅助 try-catch 处理
     * 在多重 catch块后面，可以加一个catch（Exception)来处理可能会被遗漏的异常
     * 对于不确定的代码， 也可以加上 try-catch，处理潜在的异常
     * 尽量去处理异常，切忌只是简单的调用printStackTrace()去打印输出（Alt+Enter键提示处理）
     * 具体如何处理异常，要根据不同的业务需求和异常类型去决定
     * 尽量添加finally 语句块去释放
     */
    public static void main(String[] args) {

        try {
            new ExceptionsHanding().test(1,0);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("有异常");
        } finally {
        }

    }

    //假设这个方法中，处理不了这个异常，方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{

        if (b == 0) {// throw throws
            throw new ArithmeticException();//主动抛出异常,一般用在方法中使用

        }
            //System.out.println(a / b);
    }

}
/*      //假设捕获多个异常：从小到大！
        try {//try监控区域
            //new ExceptionsHanding().a();
            if (b == 0) {// throw throws
                throw new ArithmeticException();//主动抛出异常

            }
            System.out.println(a/b);
        }catch (Error e) {//catch(想要捕获的异常类型！)捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable e){
            System.out.println("Throwable");
        }finally {//处理善后工作
            System.out.println("finally");
            //finally 可以不要finally, 假设IO，资源，关闭！
        }
    public void a(){b();}
    public void b(){a();}
 */