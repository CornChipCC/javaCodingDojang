import java.util.ArrayList;
import java.util.Scanner;

/* 가장 긴 공통의 부분문자열 구하기 */
public class practice65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        ArrayList<String> strList1 = new ArrayList<>();
        ArrayList<String> strList2 = new ArrayList<>();
        ArrayList<String> answerList = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i+1; j <=str1.length() ; j++) {
                strList1.add(str1.substring(i,j));
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            for (int j = i+1; j <=str2.length() ; j++) {
                strList2.add(str2.substring(i,j));
            }
        }

        for (String string : strList1) {
            for (String string2 : strList2) {
                if(string.equals(string2)){
                    answerList.add(string);
                }
            }
        }
        int max = 0;
        String answer = "";
        for (int i = 0; i < answerList.size(); i++) {
            if(answerList.get(i).length() >= max){
                max = answerList.get(i).length();
                answer = answerList.get(i);
            }
        }

        System.out.println(max);
        System.out.println(answer);
    }
}
