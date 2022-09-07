import java.util.ArrayList;
import java.util.Scanner;

/* 2진법으로 자연수 나타내기 */

public class practice19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자연수를 입력 하세요 : ");
        int num = sc.nextInt();
        String answer = binary(num);

        System.out.println(answer);
    }

    public static String binary(int num) {

        ArrayList<Integer> answerList = new ArrayList<Integer>();
        String answer = "";
        while(num >1){
            answerList.add(0,num%2);
            num = num / 2;
        }
        
        answerList.add(0,1);
        for (Integer integer : answerList) {
            answer += integer;
        }
        return answer;
    }
}
