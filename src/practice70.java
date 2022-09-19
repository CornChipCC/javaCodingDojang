import java.util.Scanner;

/* 친화수 */
public class practice70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        String answer = "";
        int count = 0;
        int temp = 0;
        for (int i = 1; i <= limit; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    sum += j;
                }
            }
            int sum2 = 0;
            for (int j = 1; j < sum; j++) {
                if(sum % j == 0){
                    sum2 += j;
                }
            }
            if(sum2 == i && i!=sum && sum!=temp){
                answer += "(" + i + "," + sum + ") ";
                count ++;
                temp = i;
            }
        }
        System.out.println(answer + " , 갯수 : " + count);
    }
}
