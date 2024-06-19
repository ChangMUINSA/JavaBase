package base;

public class DataExtension {
    public static void main(String[] args) {
        // 整数拓展： 进制 二进制 十进制 八进制0 十六进制0x

        int i = 10;
        int i2 = 010; //八进制
        int i3 = 0x10; // 十六进制

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("====================================================");
        //=============================================================================================
        //浮点数拓展？          银行业务怎么表示？钱
        // BigDecimal         数学工具类
        //=============================================================================================


        // float 有限 离散 舍入误差 大约 接近但不等于
        // double
        // 最好不要使用浮点数进行比较！！！


        float f = 0.1f;
        double d = 1.0/10;

        System.out.println(f==d); // false

        float d1 = 2323325666522f;
        float d2 = d1 + 1;

        System.out.println(d1 == d2); // true


        //=============================================================================================
        //字符拓展
        //=============================================================================================
        System.out.println("===================================================================");
        char c1 = 'A';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1);//强制转换

        System.out.println(c2);
        System.out.println((int)c2);//强制转换

        //所有字符本质还是数字
        // 编码 Unicode 表：

        //底层 U0000 UFFFF

        char c3 = '\u0061';

        System.out.println(c3);

        //转义字符
        // \t 制表符
        // \n 换行符

        System.out.println("hello\nWorld!");

        System.out.println("============================================================================");

        String sa = new String("helloWorld");
        String sb = new String("helloWorld");

        System.out.println(sa == sb);//False

        String sc = "helloWorld";
        String sd = "helloWorld";
        System.out.println(sc == sd);//True


        //=================================================================================
        //布尔值的扩展
        //=================================================================================
        boolean flag = true;
        if (flag == true){}
        if (flag){}

    }
}
