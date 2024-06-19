package ProcessControl.structure;

public class StructureFor {
    public static void main(String[] args) {
        // for 循环的执行次数一般在执行前就是确定的
        /**
         * 最先执行初始化步骤，可以声明一种类型，但可以初始化一个或者多个循环控制变量，也可以是空语句
         * 然后检查布尔表达式的值， 如果为true 执行循环体， 如果为false 开始执行循环提后面的语句
         * 执行一次循环后，更新循环控制变量
         * 迭代因子控制循环变量的增减
         * for 的死循环写法
         * for(;;){}
         */
        int oddNumber = 0;
        int evenNumber = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                evenNumber+=i;
            } else{
                oddNumber+=i;
            }
        }
        System.out.println("奇数的和 :" + oddNumber);
        System.out.println("偶数的和 ：" + evenNumber);


    }
}
