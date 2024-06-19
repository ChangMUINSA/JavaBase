package base.operator;
//优先级用括号（）弄的明明白白
public class Operator {
    public static void main(String[] args) {
        // 二元运算符
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);

        long e = 122354683546874L;
        int f = 123;
        short g = 10;
        byte h = 8;
        //如果多个操作数相加时有一个数为long,则结果类型是long;否则结果类型为int.
        System.out.println("========================================================");
        System.out.println(e+f+g+h);
        System.out.println(f+g+h);
        System.out.println((double) (g+h));

        //关系运算符 ：： 正确，错误  布尔值
        int x = 10;
        int y = 20;

        System.out.println("========================================================");
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x==y);
        System.out.println(x!=y);
        // 取模运算符 %
        int z = 11;
        System.out.println("=========================================================");
        System.out.println(y%z);
        System.out.println(z%y);
        System.out.println(x%y);

        //一元运算符  ++ -- 自增， 自减
        int u = 3;
        int v = u++;// 先赋值再自增
        int w= ++u;// 先自增再赋值
        System.out.println("==========================================================");
        System.out.println(u);
        System.out.println(u);

        System.out.println(v);
        System.out.println(v);


        System.out.println(w);
        System.out.println(w);

        //幂运算 2^3 2*2*2  很多运算可以使用一些工具类来操作！
        double pow= Math.pow(2, 3.);
        System.out.println("============================================================");
        System.out.println(pow);


    }
}
