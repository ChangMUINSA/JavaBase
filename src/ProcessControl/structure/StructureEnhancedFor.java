package ProcessControl.structure;

public class StructureEnhancedFor {
    public static void main(String[] args) {
        //主要用于遍历
        /***
         * for (声明语句 ： 表达式){
         *     //代码句子
         * }
         * 声明语句 ： 声明新的局部变量，该变量的类型必须和数组元素相匹配，其作用域限定在循环语句块， 其值与此时数组元素的值相等
         * 表达式 ： 表达式是要访问的数组名， 或者是返回值为数组的方法
         */

        //遍历数组
        int [] numbers = {10,20,30,40,50,60};
        for (int i : numbers){
            System.out.println(i);
        }
    }
}
