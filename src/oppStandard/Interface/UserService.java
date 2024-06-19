package oppStandard.Interface;
//interface 定义的关键字,接口都需要有实现类
public interface UserService {
    //接口里定义的属性默认为常量
    public static final int AGE =99;


    //接口中的所有定义的方法都是抽象的 public abstract
    public abstract void add (String name);
    void delete (String name);
    void update (String name);
    void query (String name);

}
