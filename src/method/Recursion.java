package method;

public class Recursion {
    public static void main(String[] args) {
        // 递归就是A方法调用A方法！ 自己调用自己
        //递归是一种思想，适合基数小的问题，否则桟溢出
        /***
         * 递归的能力在于用有限的语句来定义对象的无限集合
         * 递归包括两个部分 ：
         * 递归头： 什么时候不调用自身方法. 如果没有头将陷入死循环
         * 递归体： 什么时候需要调用自身方法.
         */
        /**
         * 边界条件： 压桟直到函数能取到具体的值
         * 前阶段 ： 压桟（main 函数位于桟的最底层）
         * 返回阶段
         */
        Recursion recursion = new Recursion();
        //阶乘
        System.out.println(f(2));
    }
    public static int f(int n){
        if (n == 1) {
            return 1;
        }else {
            return n*f(n-1);
        }
    }

}
