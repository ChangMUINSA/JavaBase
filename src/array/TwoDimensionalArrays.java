package array;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        /**
         * 多维数组可以看成是数组的数组， 比如二维数组就是一个特殊的一维数组，其每一个元素都是一个一维数组
         * 二维数组
         *  int [][] a = new int[2][3];
         *  以上数组 a 可以看成是一个两行五列的数组
         */
        //[4][2]

        int [][] a = {{1,2},{3,4},{5,6}};
        for(int[] c: a){
            printArrays(c);
        }
        System.out.println("====================================");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
        System.out.println("==============================================================");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                count+=1;
                if (count % 2 == 0) {

                    System.out.println(a[i][j]);
                }else {
                    System.out.print(a[i][j]);

                }
            }
        }
        System.out.println("======================================================");
        printArrays(a[0]); //1 2
        System.out.println("=======================================================");
        System.out.println(a[0][0]); //1

    }
    public static void printArrays (int[] arrays){
        for (int i : arrays) {

            System.out.print(i + " ");
        }
        System.out.println();
    }
}
