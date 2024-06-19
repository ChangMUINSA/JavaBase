package oppStandard.inheritance;
//在java中所有的类都默认直接或者间接继承 object 类.
//Person 人 ： 父类
//快捷键 F4 能够看到继承树
public class PersonInh /*extends Object*/{
    //public
    //protected
    //default, 什么都不写，默认default
    //private

    private int money = 10_0000_0000;
    public void say(){
        System.out.println("说了一句话");
    }
    public int getMoney(){
        return this.money;
    }
    public void setMoney(int money){
        this.money = money;
    }
}
