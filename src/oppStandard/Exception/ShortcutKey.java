package oppStandard.Exception;

public class ShortcutKey {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        //control+alt+win+t
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            //System.exit(0);
            e.printStackTrace();//打印错误的桟信息
        } finally {
        }
    }
}
