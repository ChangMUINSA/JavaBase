package method;

public class WhatMethod {
    public static void main(String[] args) {
        /**
         * 例如 System.out.println()
         *     类   标准输出对象  方法
         * Java 方法是语句的集合，他们在一起执行一个功能
         * 方法是解决一类问题的步骤的有序组合
         * 方法包含于类或对象中
         * 方法在程序中被创建，在其他地方被引用
         * 设计方法原则 ： 就是一个方法只完成一个功能， 这样有利于我们后期的扩展
         * 方法命名规则： 小驼峰
         */
        /**
         * main 方法尽量保持简洁干净
         * 公共模块都提取到外面，通过方法调用的形式来使用
         * main 方法位于桟的最底层
         */
        //int sum= add(1,2);
        //System.out.println(sum);
        test();
    }
    //加法方法
    public static int add(int a, int b){
        return a+b;
    }
    public static void test(){
        for (int m = 101; m < 150; m++) {
            for (int j = 2; j <=m/2 ; j++) {
                if (m % j == 0) {
                    //continue outer;
                    break;
                } else if (j==m/2) {

                    System.out.println(m);
                }
            }

        }
    }
}
