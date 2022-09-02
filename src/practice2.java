/* 탭을 공백 문자로 바꾸기 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        
        String answer = tabToSpace();
        
        System.out.println(answer);
    }

    public static String tabToSpace() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력하세요. ");

        String str = scanner.nextLine();
        List<Integer> strNum = new ArrayList<>();

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int temp = (int) str.charAt(i);
            if(temp == 9){
                strNum.add(32);
                strNum.add(32);
                strNum.add(32);
                strNum.add(32);
            }
            else{
                strNum.add(temp);
            }
        }
        for (int i = 0; i < strNum.size(); i++) {
            answer += (char) strNum.get(i).intValue();
        }
        return answer;
    }
}
