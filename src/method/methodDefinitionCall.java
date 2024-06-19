package method;

public class methodDefinitionCall {
    public static void main(String[] args) {
        /**
         * 方法是一段用来完成特定功能的代码片段
         * 方法包含一个方法头和方法体
         * 修饰符 ： 这是可选的，告诉编译器如何调用该方法，定义了该方法的访问类型
         * 返回值类型 ： 方法可能会有返回值. return ValueType是方法返回值的数据类型， 有些方法执行所需的操作， 但没有返回值， 在这种情况下， returnValueType 是关键字 void;
         * 方法名 ： 是方法的实际名称. 方法名和参数表共同构成方法签名.
         * 参数类型 ： 参数像是一个占位符.当方法被调用时传递值给参数， 这个值被称为实参或者变量.
         * 参数列表是指方法的参数类型，顺序和参数的个数. 参数是可选的， 方法可以不包含任何参数.
         * 形式参数： 在方法背调用时用于接收外界输入的数据； 形式参数用来定义作用的
         * 实参： 调用方法时实际传给方法的数据； 实际调用传递给他的参数
         * 方法体： 方法体包含具体的语句，定义该方法的功能.
         */
        // !!! return 除了返回结果， 还有终止方法的含义

        /**
         * 方法的调用 ： 对象名.方法名（实参列表）
         * Java支持两种调用方法的方式， 根据方法是否返回值来选择
         * 当方法返回一个值时， 方法调用通常被当做一个值.
         *  int larger = max (10; 40);
         * 如果方法返回值是void, 方法调用一定是一条语句
         *  System.out.println("hello, world!")
         */
        int max = max(10,10);
        System.out.println(max);
    }
    // 比大小的方法
    public static int max(int number1, int number2){
        int result = -1;
        if (number1 == number2) {
            System.out.println("number1 = number2");
            return 0;
        }
        if (number1 > number2) {
            result = number1;
        }else {
            result = number2;
        }


        return result;
    }
}
