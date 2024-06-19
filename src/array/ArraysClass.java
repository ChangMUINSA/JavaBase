package array;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        /**
         * Arrays类中的方法都是 static 修饰的静态方法，在使用的时候可以直接使用类名进行调用，而不用使用对象来调用
         *以下常用功能 ：
         * 给数组赋值 ： 通过 fill 方法
         * 对数组排序： 通过 sort 方法， 按照升序
         * 对比数组 ： 通过 equals 方法比较数组中的元素值是否相等
         * 查找数组元素 ： 通过binarySearch 方法能对排序好的数组进行二分查找法操作
         */
        int [] a = {5,987,564,201,99999};
        System.out.println(Arrays.toString(a)); // 打印数组元素
        System.out.println("==================================================");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));// 数组排序
        Arrays.fill(a, 2, 4,0);// 数组填充
        System.out.println("===================================================");
        System.out.println(Arrays.toString(a));
    }
}
