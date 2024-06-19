package array;

public class StatementCreation {
    public static void main(String[] args) {
        /**
         * 声明数组变量：
         * dataType[] arrayRefVar;
         * Java 语言使用 new 操作符来创建数组
         * dataType[] arrayRefVar = new dataType[arraySize];
         * 数组元素是通过索引访问的， 数组索引从零开始.
         * 获得数组的长度： array.length
         */
        //常见错误 ： .ArrayIndexOutOfBoundsException —— 数组下标越界
        int [] nums; //定义, 声明一个数组
        nums = new int[10]; //开辟一块空间， 创建一个数组
        /**
         * 声明和创建写在一块
         * int[] nums = new int[10];
         */
        for (int i = 0; i <= nums.length; i++) {
            nums[i] = i;
            System.out.println(nums[i]);
        }

    }
}
