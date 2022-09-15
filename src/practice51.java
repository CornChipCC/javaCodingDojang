import java.util.ArrayList;
import java.util.Scanner;
/* 10진수를 n진수로 변환하기 */
public class practice51 {
    public static void main(String[] args) {
        int input = 233;
        ArrayList<String> answer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int rule = sc.nextInt();
        if(rule <2 || rule >16){
            System.out.println("2에서 16사이의 숫자를 입력하세요.");
            return;
        }
        
        while(!(input < rule)){
            answer.add(0, Integer.toString(input%rule));
            input /= rule;
        }
        answer.add(0, Integer.toString(input));
        for (String string : answer) {
            int temp = Integer.parseInt(string);
            if(temp >= 10){
                int str = temp%10 + 65;
                string = Character.toString((char)str);
            }
            System.out.print(string);
        }
    }
}
