package array;

public class ThreeMethodIntialization {
    public static void main(String[] args) {
        /**
         * 数组的三种初始化
         * 静态初始化 ：
         *  int [] a = {1, 2, 3};
         *  Man[] mans = {new Man(1, 1), new Man(2, 2)};
         *
         *  动态初始化：
         *  int[] a = new int[2];
         *  a[0] = 1;
         *  a[1] = 2;
         *
         *  数组的默认初始化
         */

        //静态初始化
        int [] a = {2, 3 , 4, 9, 7}; //创建加赋值
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("===========================================================================");

        Man [] mens = {new Man(), new Man()};// 引用类型 ； 在其他地方创建了一个类

        //动态初始化
        int [] b = new int[10]; //未赋值时候默认均为零，也就是包含了默认初始化
        b[0] = 10;
        System.out.println(b[0]);

        /**
         * 其长度是确定的，数组一旦被创建它的大小就是不可改变的
         * 其元素必须是相同类型，不准许出现混合类型
         * 数组中的元素可以是任何类型的数据，包括基本类型和引用类型
         * 数组变量属于引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量
         * 数组本身就是对象， java中对象是在堆中的，因此数组无论保持原始类型还是其他对象类型，数组对象本身是在堆中的
         */
    }
}
