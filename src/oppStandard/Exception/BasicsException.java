package oppStandard.Exception;

public class BasicsException {
    public static void main(String[] args) {
        //System.out.println(11/0);
        int a = 1;
        int b = 0;
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
    }
    //StackOverfiowError
//    public void a(){
//        b();
//    }
//    public void b(){
//        a();
//    }
}
