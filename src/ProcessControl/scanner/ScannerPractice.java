package ProcessControl.scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double i = 0;
        double sum = 0;
        int count = 0;
        double average = 0;
        System.out.println("请输入数 ：");
        while (scanner.hasNextDouble()){
            i = scanner.nextDouble();
            sum += i;
            count +=1;
        }
        System.out.println(count + "个数字的sum =" + sum);
        average = sum / count;
        System.out.println(count + "个数字的average =" + average);
        scanner.close();
    }
}
