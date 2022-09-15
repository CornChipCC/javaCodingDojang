import java.util.Scanner;
/* Simple Balanced Parentheses (괄호 올바르게 사용 여부) */
public class practice50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(count < 0){
                break;
            }
            if(str.charAt(i)== '('){
                count++;
            }
            if(str.charAt(i)== ')'){
                count--;
            }
        }
        if(count != 0){
            System.out.println("잘못된 괄호입니다.");
        }
        else{
            System.out.println("정상적인 괄호입니다.");
        }
    }
}
