package base;
// javadoc命令是用来生成自己API文档的
//参数信息如下：

// 可以给类加
/**
 * @author ChangMU 作者名
 * @version 1.0 版本号
 * @since 1.8 指明需要最早使用的jdk版本
 */
public class JavaDoc {

    String name;

    /**
     *
     * @param name 参数名
     * @return 返回值情况
     * @throws Exception 异常抛出情况
     */
    // “javadoc -encoding UTF-8 -charset UTF-8 JavaDoc.java” 命令行生成Javadoc文档
    // IDEA产生Javadoc的方法
    public String test (String name) throws Exception{
        return name;
    }
}
