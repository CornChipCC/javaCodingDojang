import java.util.Scanner;

/* 상품 is 뭔들 */
public class practice63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        String answer = getProduct(i, j);
        System.out.println(answer);
    }
    public static String getProduct(int i, int j) {
        String answer = "";
        int answerCount = 0;
        
        for (int l = i+1; l <= j; l++) {
            int count = 0;
            for (int k = 1; k <= l; k++) {
                if(l % k == 0) count++;
            }
            if(count % 2 == 1) answerCount++;
        }
        
        answer = Integer.toString(answerCount) + "/" + Integer.toString(j -i);

        return answer;
    }
}
