package ProcessControl.structure;

public class StructureDoWhile {
    public static void main(String[] args) {
        //即使不满足条件，程序也能执行一次
        /**
         * while 先判断后执行
         * do while 先执行后判断， 循环体至少执行一次
         */
        int a = 0;
        while (a < 0){
            System.out.println(a);
            a++;
        }
        System.out.println("==================================================================");
        do {
            System.out.println(a);
            a++;
        }while (a < 0);
    }
}
