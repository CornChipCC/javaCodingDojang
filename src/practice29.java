import java.util.Scanner;

/* 문자열을 제거한 뒤 숫자만 반환 */

public class practice29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요.");

        String str = sc.next();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if((int) temp > 47 && (int) temp <58 ){
                answer += temp;
            }
        }
        System.out.println(answer);
    }
}
