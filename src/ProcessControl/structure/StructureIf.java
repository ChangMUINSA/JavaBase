package ProcessControl.structure;

import java.util.Scanner;

public class StructureIf {
    public static void main(String[] args) {
        //if 单选择结构
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容 ：");
        String s = scanner.nextLine();

        //equals 用于判断字符串是否相等
        if (s.equals("hello")){
            System.out.println(s);
        }
        System.out.println("End");
        System.out.println("===================================================================");
        // if 双选择结构
        int score = 0;
        System.out.println("请输入成绩 ：");
        score = scanner.nextInt();
        if (score > 60){
            System.out.println("成绩合格");
        }else{
            System.out.println("继续努力！");
        }
        System.out.println("==========================================================================");
        // if 多选择结构
        /**
         * if 语句至多有一个 else 语句； else语句必须在所有else if 语句之后
         * if 语句可以有若干个 else if 语句； 他们必须在 else 语句之前
         * 一但其中一个 else if 语句检测为 true ； 其他的 else if 以及 else 都将跳过执行
         */
        System.out.println("请输入成绩具体判断");
        score = scanner.nextInt();
        if (score == 100){
            System.out.println("恭喜满分!");

        }else if (score< 100 && score >= 90) {
            System.out.println("级别为A");
        }else if (score< 90 && score >= 80) {
            System.out.println("级别为B");
        }else if (score< 80 && score >= 60) {
            System.out.println("级别为C");
        }else if (score< 60) {
            System.out.println("级别为D");
        }else {
            System.out.println("成绩不合法");
        }
        //嵌套的 if 结构
        /**
         * 你可以在 if 或者 else if 中使用 if 或者 else if 语句 ;
         * 你可以像 if 语句一样嵌套 else if ... else；
         */
        scanner.close();

    }
}
