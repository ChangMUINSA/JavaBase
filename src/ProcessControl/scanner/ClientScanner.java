package ProcessControl.scanner;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class ClientScanner {
    // Scanner 对象
    //java.util.Scanner是java5的新特征
    //通过Scanner来获取用户的输入
    //基本语法： Scanner s = new Scanner(System.in)
    //通过Scanner类的next()与nextLine()方法获取输入的字符串
    //在读取前我们一般使用hasNext()与hasNextLine()判断是否还有输入的数据
    public static void main(String[] args) {
        //创建一个扫描器对象，用来接收键盘数据
        Scanner scanner = new Scanner(System.in);

//        System.out.println("使用next方式接收： ");
        System.out.println("使用nextLine方式接收: ");
        //判断用户有没有输入字符
//      if (scanner.hasNext()){}
        if (scanner.hasNextLine()){
            //使用next方式接收用户输入
//            String str = scanner.next();//程序会等待用户输入完毕
//            System.out.println("输出的内容为 ：" +str);

            String str = scanner.nextLine();
            System.out.println("输出内容为： " +str);

            //凡是属于IO流的类如果不关闭会一直占用资源，要养成好习惯用完就关掉.
            //scanner.close();

        /*
         *next 和 nextLine() 的 区别
         *
         * next()
         * 一定要读取到有效字符后才可以结束输入
         * 对输入有效字符之前遇到的空白，next()方法会将其自动去掉
         * 只有输入有效字符后才能将其后面输入的空白作为分隔符或结束符
         * next()不能得到带有空格的字符串
         *
         * nextLine()
         * 以Enter为结束符也就是说nextLine()方法返回的是输入回车之前的所有字符
         * 可以获得空白
         */
            System.out.println(">>>>>>>>");
            String s1 = scanner.nextLine();
            System.out.println(s1);
            String s2 = scanner.nextLine();
            System.out.println(s2);
            String s3 = scanner.nextLine();
            System.out.println(s3);
            System.out.println(">>>>>>>>");


        }
    }
}
