import java.util.Scanner;

/* Printing OXs(비트 연산) */

public class practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int tmp = (int)Math.pow(2, n);
        for (int i = 1; i < n+1; i++) {

            String str =Integer.toBinaryString((tmp-2 >> i) * (int)Math.pow(2, i));

            if(str.equals("0")){
                for (int j = 0; j < n; j++) {
                    System.out.print("X");
                }
            }
            else{
                str = str.replace("1", "O");
                str = str.replace("0", "X");
    
                System.out.println(str);
            }
            
        }
    }
}
