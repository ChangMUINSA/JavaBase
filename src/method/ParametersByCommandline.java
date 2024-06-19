package method;

public class ParametersByCommandline {
    /**
     * main() 方法也可以传参
     * hxlb3422@yd-5cg82676sy:~/Documents/BASE/src/method$ javac ParametersByCommandline.java 编译
     * hxlb3422@yd-5cg82676sy:~/Documents/BASE/src$ java method.ParametersByCommandline 执行（运行class文件时），退回src,输入完整包名（即找到完整的包的路径）
     * hxlb3422@yd-5cg82676sy:~/Documents/BASE/src$ java method.ParametersByCommandline this is Chang 通过命令行传参数
     * args[0] :this
     * args[1] :is
     * args[2] :Chang
     */
    public static void main(String[] args) {
        //有时候你希望运行一个程序的时候再传递给它消息. 这要靠传递命令行参数给 main(）函数实现.
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] :" + args[i]);
        }
    }
}
