package oop;

public class ValueAndQuotationPropagation {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);//1
        //值传递
        ValueAndQuotationPropagation.change(a);
        System.out.println(a);//1
        System.out.println("=================================================================");



    }
    public static void change(int a){
        a = 10;
    }
}
