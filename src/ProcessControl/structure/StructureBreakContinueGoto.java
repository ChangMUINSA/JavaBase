package ProcessControl.structure;

public class StructureBreakContinueGoto {
    public static void main(String[] args) {
        int i = 0;
        while (i < 35){
            i++;
            if (i == 30) {
                //break;
                continue; //使程序重新跳回循环开始的地方
            }
            System.out.println(i);
        }
        System.out.println("===============================================================================");
        //标签 , 不建议使用
        //输出 101~150 之间的所有质数
        outer: for (int m = 101; m < 150; m++) {
                    for (int j = 2; j <=m/2 ; j++) {
                        if (m % j == 0) {
                            //continue outer;
                            break;
                        } else if (j==m/2) {

                            System.out.println(m);
                        }
                    }

        }
    }
}
