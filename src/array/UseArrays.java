package array;

public class UseArrays {
    public static void main(String[] args) {
        int[] arrays = {1, 2 , 3 , 4 , 5};

        //打印全部的数组元素
        for (int i : arrays){
            System.out.println(i); //增强型for循环取不到下标(For-Each循环)
        }
        System.out.println("=================================================");
        for (int i = 0; i < arrays.length; i++) {

            System.out.println(arrays[i]);
        }
        //计算所有元素的和
        int sum =0;
        System.out.println("=================================================");
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("sum =" + " " + sum);
        //查找最大元素
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[0] < arrays[i]) {
                arrays[0] = arrays[i];
            }
        }
        System.out.println("=============================================");
        System.out.println("max =" + " " + arrays[0]);
        System.out.println("==============================================");
        printArrays(arrays);
        System.out.println("==============================================");
        reversalArrays(arrays);

    }
    //数组作为方法入参
    public static void printArrays (int[] arrays){
        for (int i : arrays) {

            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reversalArrays(int[] arrays){
        int[] arraysRevrsal = new int[arrays.length];
        for (int i = 0, j =arraysRevrsal.length-1; i < arrays.length && j >= 0; i++, j--) {
            arraysRevrsal[j] = arrays[i];

        }
        System.out.print("The arraysRevrsal is :" + " ");
        for (int x : arraysRevrsal) {
            System.out.print(x);
        }
        System.out.println();
    }
}
