import java.util.Scanner;
/* 초 완전수 */
public class practice67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int sum = 0;
        int answer1 = 0;
        int answer2 = 0;

        String answer = "";
        for (int i = 2; i <= limit; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    sum += j;
                }
            }
            
            sum = sum - 1 -i;
            if(sum == 0) continue;
            if((i-1) % sum == 0){
                answer2 = (i-1) / sum;
                answer1 = i;
                
                answer += "(" + answer1 + "," + answer2 + ") ";
            }
             
        }

        System.out.println(answer);
    }
}
