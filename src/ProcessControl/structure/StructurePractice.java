package ProcessControl.structure;

public class StructurePractice {
    public static void main(String[] args) {
        for (int i = 1 , j =0 ; i <= 1000 ; i++) {
            if (i % 5 ==0){
                j+=1;
                if (j %3 != 0){
                    System.out.print(i + "\t");
                }else{
                    System.out.println(i);
                }
            }
        }
    }
}
