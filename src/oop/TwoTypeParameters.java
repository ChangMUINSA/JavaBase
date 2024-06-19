package oop;

public class TwoTypeParameters {
    public static void main(String[] args) {
        //实际参数和形式参数的类型要对应！
        int add = TwoTypeParameters.add(1,2);
        System.out.println(add);
    }
    public static int add(int a , int b){
        return a+b;
    }
}
