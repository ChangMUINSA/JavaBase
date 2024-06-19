package method;

public class MethodOverLoading {
    public static void main(String[] args) {
        //重载就是在一个类中，有相同的函数名称，但形参不同的函数
        /**
         * 方法重载的规则
         * 方法名称必须相同
         * 参数列表必须不同（个数不同，或类型不同，参数排列顺序不同等）
         * 方法的返回类型可以相同也可以不同
         * 仅仅返回类型不同不可以成为方法的重载
         *
         * 方法名称相同时，编译器会根据调用方法的参数个数，参数类型等去逐个匹配，以选择对应的方法，如果匹配失败则编译器报错
         */
        double max = max(10.0,20.0);
        System.out.println(max);
    }
    // 比大小的方法
    public static double max(double number1, double number2){
        double result = -1;
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
    // 比大小的方法
    public static int max(int number1, int number2, int number3){
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
