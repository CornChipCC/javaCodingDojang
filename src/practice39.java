import java.util.Scanner;
/* Every Other Digit */
/* 모든 짝수번째 숫자를 *로 치환 */
public class practice39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 1; i < str.length(); i+=2) {
            if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                str = str.substring(0, i) + '*' + str.substring(i+1);
            }
        }

        System.out.println(str);
    }
}
