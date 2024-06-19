package oppStandard.InnerClass;
//一个java类中可以有多个class类，但只能有一个public class
public class Outer {
    private int id = 10;
    public void method(){
        class Inner{
            //局部内部类
            public void in (){

            }

        }
    }
    public void out(){
        System.out.println("这是外部类的方法");
    }
    public class Inner{
        //成员内部类
        public void in(){
            System.out.println("这是里面的方法");
        }
        //内部类访问外部类的私有属性!!!
        public void getID(){
            //System.out.println(id);
            //out();

        }
    }
}
