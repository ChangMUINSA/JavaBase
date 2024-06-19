package array;

import java.util.Arrays;

public class SparseArray {
    public static void main(String[] args) {
        //指其元素大部分为0的数组； 压缩数组
        /**
         * 编写五子棋游戏中有存盘退出和续上盘的功能
         * 因为该二维数组中很多值得默认值是0，因此记录了很多没有意义的数据
         * 可以用稀疏数组来解决
         */
        /**
         *当一个数组中大部分元素为0；或者为同一个值得数组时，可以使用稀疏数组来保存该数组
         * 稀疏数组的处理方式是
         * 记录数组一共有几行几列，有多少个不同值
         * 把具有不通值得元素的行列和值记录在一个小规模数组中，从而缩小程序的规模
         */
        //1,创建一个二维数组, 11*11, 0: 没有棋子； 1：黑棋子; 2：白棋
        int[][] array1= new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        System.out.println("输出原始数组：");
        // !二维数组的增强for循环写法
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("==========================================================");
        //转换为稀疏数组来保存
        //1,获取有效值的个数
        int sum = 0;
        for (int[] ints : array1) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    sum++;
                }
            }
        }
        System.out.println("有效值个数 ： " + " " + sum );
        //2.创建一个稀疏数组的数组
        int [][] array2 = new int[sum+1][3];//固定写法
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;
        //3,遍历二维数组，将非零的值，存放在稀疏数组中
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        //4,输出稀疏数组
        System.out.println("=====================================================");
        System.out.println("稀疏数组：");
        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("===================================================");
        //还原稀疏数组
        //1,读取稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        //2.给其中的元素还原它的值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        //3.打印还原的数组
        System.out.println("还原数组：");
        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }
}
