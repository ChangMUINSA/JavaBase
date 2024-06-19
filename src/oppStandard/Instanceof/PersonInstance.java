package oppStandard.Instanceof;

public class PersonInstance {
    public void run(){
        System.out.println("run");
    }
}
/**
 * 父类指向子类的引用对象
 * 把子类转化为父类，向上转型；
 * 把父类转化为子类，向下转型； 强制转换，可能会丢失一些方法.
 * 方便方法的调用， 减少重复的代码！简洁
 *
 * 抽象： 封装. 继承. 多态！ 抽象类，接口
 */
/*
public static void main(String[] args) {
        //类型之间的转化： 基本类型的转换 高低（64 32 16）
        //父类 子类
        //高                                       低
        //PersonInstance studentInstance = new StudentInstance();
        //将这个对象转换为Student类型， 我们就可以使用Student类型的方法了！

        //((StudentInstance)studentInstance).go();
        StudentInstance studentInstance = new StudentInstance();
        studentInstance.go();
        //子类转换成父类,可能会丢失自己本来的一些方法！
        PersonInstance personInstance = studentInstance;
        personInstance.run();
    }

 */