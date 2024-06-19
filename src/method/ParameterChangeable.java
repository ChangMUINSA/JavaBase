package method;

import java.awt.*;

public class ParameterChangeable {
    public static void main(String[] args) {
        /**
         * JDK1.5 开始，java 支持传递同类型的可变参数给一个方法
         * 在方法声明中，在指定参数类型后加一个省略号（...）
         * 一个方法中只能指定一个可变参数， 它必须是方法的最后一个参数，任何普通的参数必须在它之前声明.
         * 不定项参数
         */
        ParameterChangeable parameterChangeable = new ParameterChangeable();
        parameterChangeable.method(45,1,2,3,4,5);
        System.out.println("======================================================================");
        //调用可变参数的方法
        printMax(12.03,36.54,58.96);
        printMax(new double[]{1, 2, 3});
    }

    public void method(int x, int... i){
        System.out.println(x);
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
    }
    public static void printMax(double... numbers){
        if (numbers.length == 0) {
            System.out.println("NO argument passed");
            return; //return 用来终止方法
        }
        double result = numbers[0];

        //排序
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

}
