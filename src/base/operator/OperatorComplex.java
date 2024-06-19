package base.operator;

public class OperatorComplex {
    public static void main(String[] args) {
        //逻辑运算符
        //与 或 非
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));//逻辑与运算： 两个变量都为真结果才为真
        System.out.println("a || b: " + (a || b));//逻辑或运算： 两个变量有一个结果为真结果就为真
        System.out.println("! (a && b): "+ (! (a && b)));//如果是真则变为假

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);//如果与运算中第一个条件为假，则后面的条件不执行也不近行判断.
        System.out.println("===================================================================");
        System.out.println(d);
        System.out.println(c);


        //位运算 效率极其高
        /*
        A = 0011 1100
        B = 0000 1101

        A&B = 0000 1100 有两个1才为1
        A/B = 0011 1101 有一个1即为1
        A^B = 0011 0001 相同为0，不同为1
        ~B = 1111 0010

        2*8 = 16 2*2*2*2 如何计算最快
        << 左移 *2
        >> 右移 /2
         */
        System.out.println("===========================================================");
        System.out.println(2<<3);

        //扩展运算符
        int x = 10;
        int y = 20;
        x+=y;
        System.out.println("==============================================================");
        System.out.println(x);

        //字符串连接符 +  只要加号有一方出现String类型，则自动会把其他操作数转化为String类型后进行连接
        System.out.println("=============================================================");
        System.out.println("" + x + y);//3020
        System.out.println(x + y + "");//50 !先运算再拼接

        //三元运算符
        // x ? y : z
        //如果x==true, 则结果为y, 否则结果为z.

        int score = 50;
        System.out.println("=================================================================");
        String type = score < 60 ? "bad" : "good";
        System.out.println(type);
    }
}
