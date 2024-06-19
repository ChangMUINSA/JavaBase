package oppStandard.Static;
//静态导入包
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(random());//由于静态导入包
        System.out.println(PI);//由于静态导入包
    }
}
