package array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //冒泡算法是最出名的排序算法； 一共有八种排序算法
        /**
         * 思想 ：
         * 比较数组中两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
         * 每一次比较都会产生出一个最大或者最小的数字
         * 下一轮则可以少一次排序
         * 复杂度 O（n2）
         */
        int [] a = {5,987,564,201,99999};
        System.out.println(Arrays.toString(sort(a)));

    }
    // 冒泡升序 是 >; 冒泡降序 是 <
    public static int[] sort(int [] array){
        int t =0;
        // 外层循环判断我们要走多少次
        for (int i = 0; i < array.length -1; i++) {
            boolean flag = false; // 通过 flag 标识符减少没有意义的比较
            // 内层循环，较数组中两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
            for (int j = 0; j < array.length - 1 -i ; j++) {
                if (array[j+1] < array[j]) {
                    t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        return array;

    }
}
