import java.util.Scanner;
/* 문자에 해당하는 아스키코드를 알아내는 코드 */
public class practice28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요.");

        char ch  = sc.next().charAt(0);
        int aski = (int) ch;

        System.out.println(ch + "는 아스키 코드로 " + aski + "입니다.");
    }
}
