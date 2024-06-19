package base;

public class TransFormat {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;//内存溢出

        System.out.println(i);
        System.out.println(b);
        //===================================================================================
        // 低---------------------------------------------------------------->高
        //    byte,short,char-> int -> long -> float -> double
        //===================================================================================
        //强制转换 （类型）变量名 高-->低
        //自动转换 （类型） 低-->高
        System.out.println("======================================================");
        double c = i;
        System.out.println(c);
        System.out.println("======================================================");

        System.out.println((int)23.7); //23
        System.out.println((int)-45.7f); //-45
        System.out.println("======================================================");
        char d = 'a';
        int f = d+1;
        /*
        注意点：
        1. 不能对布尔值进行转化
        2.不能把对象类型转化为不相干的类型
        3.把高容量转化为低容量，强制转换
        4.转换的时候可能存在内存溢出， 或者精度问题
         */
        System.out.println(f);
        System.out.println((char)f);
        System.out.println("================================================================================");
        //==================================================================================
        //操作比较大的数时注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        //==================================================================================
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total = money*years;
        System.out.println(total);//-1474836480, 计算时候提出了
        long total2 = money*years;//默认是int， 转换之前已经存在问题了？
        System.out.println(total2);

        //如何计算不出问题
        long total3 =money*((long)years);//先把一个数转化为long
        long total4 =((long)money)*years;//先把一个数转化为long
        System.out.println(total3);
        System.out.println(total4);

        // 尽量使用大写L
        float p = 20000000000L;
        float m = 20000000000l;
        System.out.println(m);

    }
}
