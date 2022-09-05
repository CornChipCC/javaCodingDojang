import java.util.Scanner;

/* Duplicate Numbers */
public class practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();        

        int[] countNum = new int[10];
        boolean answer = true;

        for (int i = 0; i < input.length(); i++) {
            int a = input.charAt(i)- '0';                   // char형을 int형으로
            countNum[a]++;
        }

        for(int i = 0; i< countNum.length; i++) {
            if(countNum[i] != 1){
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}
