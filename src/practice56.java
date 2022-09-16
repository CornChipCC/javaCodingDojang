import java.util.Scanner;
/* ASCII Art N */
public class practice56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rule = sc.nextInt();

        for (int i = 0; i < rule; i++) {
            System.out.print("N");
            for (int j = 1; j <= rule-2; j++) {
                if(i == j){
                    System.out.print("N");
                }
                else{
                 System.out.print(" ");
                }
            }
            System.out.println("N");
        }
    }
}
