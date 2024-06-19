package oppStandard.Exception;

public class Definition {
    /**
     *异常指程序运行中出现的不期而至的各种状况，如：文件找不到，网络连接失败，非法参数等.
     * 异常发生在程序运行期间，它影响了正常的程序执行流程
     *
     * 异常可以分为三大类
     * 检查性异常：最具代表的检查异常是用户错误或问题引起的异常，这是程序猿无法遇预见的.
     * 例如要打开一个不存在的文件时，一个异常就发生了，这些异常在编译时不能被简单的忽略
     *
     * 运行时异常：运行时异常是可能被程序员避免的异常.与检查性异常相反，运行时异常可以在编译时被忽略.
     *
     * 错误 ERROR：错误不是异常，而是脱离程序员控制的问题.错误在代码中通常被忽略.
     * 例如，当桟溢出时，一个错误就发生了，它们在编译时也检查不到.
     *
     * 异常处理框架
     * 异常体系结构：
     * Java 把异常当做对象来处理，并定义一个基类java.lan.Throwable 作为所有异常的超类
     * 在Java API中已经定义了许多异常类， 这些异常分为两大类， 错误 Error 和异常 Exception.
     *
     * Error
     * Error类对象由Java虚拟机生成并抛出，大多数错误与代码编写者所执行的操作无关
     * Java虚拟机运行错误（Virtual MachineError）,当JVM不再有继续执行操作所需的内存资源时，将出现OutOfMemoryError.这些异常发生时，java虚拟机（JVM）一般会选择线程终止.
     * 还有发生在虚拟机试图执行应用时， 如类定义错误（NoClassDefFoundError）,链接错误（LinkageError）.这些错误是不可查的， 因为它们在应用程序的控制和处理能力之外，而且绝大多数是程序运行时不准许出现的状况.
     *
     * Exception
     * 在 Exception 分支中右腿一个重要的子类 RuntimeException(运行时异常)
     * ArrayIndexOutBoundsException 数组下标越界
     * NullPointerException 空指针异常
     * ArithmeticException 算数异常
     * MissingResourceException 丢失资源
     * ClassNotFoundException 找不到类
     * 这些异常不是检查异常， 程序中可以选择捕获处理， 也可以不处理
     *这些异常一般是由于逻辑错误引起的，程序应该从逻辑角度尽可能避免这类异常的发生；
     *
     * Error 和 Exception 的区别： Error通常是灾难性的致命错误，是程序无法控制和处理的，当出现这些异常时，Java的虚拟机（JVM）一般会选择终止线程
     * Exception 通常情况下是可以被程序处理的，并且在程序中应该尽可能的去处理这些异常
     */
}
