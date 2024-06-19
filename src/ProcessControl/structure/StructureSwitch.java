package ProcessControl.structure;

public class StructureSwitch {
    public static void main(String[] args) {
        // switch case 语句判断一个变量与一系列中某个值是否相等，每个值称为一个分支
        /**
         * switch 语句中的变量类型可以是
         * byte,short,int,char
         * 从 java SE7 开始
         * switch 支持字符串 String 类型了
         * 同时 case 标签必须为 字符串常量 或者 字面量
         */

        //case 穿透 //switch 匹配一个具体的值
        char grade = 'B';
        String name = "Chang";
        // JDK7 的新特性，表达式结果可以是字符串！！
        //字符的本质还是数字

        //反编译  java ...class (字节码文件) ...反编译（IDEA）
        switch (name){
            case "Chang" :
                System.out.println("优秀");
                break; //可选
            /*case 'B' :
                System.out.println("良好");
            case 'C' :
                System.out.println("及格");
            case 'D' :
                System.out.println("差");
            case 'E' :
                System.out.println("挂科");
            default:
                System.out.println("未知等级");*/

        }
    }
}
