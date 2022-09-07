import java.util.Scanner;

/* 시저 암호 풀기 */
public class practice18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열과 암호 숫자를 입력하세요.");
        
        String input = sc.next();
        int pwdNum = sc.nextInt();
        String answer = password(input, pwdNum);

        System.out.println(answer);
    }
    public static String password(String str, int n) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int temp = (int) str.charAt(i) +  n;
            answer += (char) temp;
        }

        return answer;
    }
}
