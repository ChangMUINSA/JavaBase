package ProcessControl.structure;

public class StructureWhile {
    public static void main(String[] args) {
        int i = 0;
        //只要布尔表达式为true，循环就会一直直行
        //少部分情况需要循环一直直行，比如服务器的请求响应监听等
        //循环条件一直为true会造成死循环
        // 输出 1~100
        while (i < 100){
            i++;
            System.out.println(i);
        }
        //计算1~100的和
        int j = 0;
        int sum = 0;
        while (j < 100){
            j++;
            sum+=j;
        }
        System.out.println(sum);
    }
}
