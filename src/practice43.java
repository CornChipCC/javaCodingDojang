import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* 487-3229 */
public class practice43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> telList = new ArrayList<>();
        ArrayList<String> answerList = new ArrayList<>();
        

        int rule = sc.nextInt();

        // '-' 빼고 저장
        for (int i = 0; i < rule; i++) {
            String str = sc.next().replace("-", "");
            telList.add(str);            
        }

        for (int i = 0; i < telList.size(); i++) {
            String answer = "";
            for (int j = 0; j < telList.get(i).length(); j++) {
                char aski = telList.get(i).charAt(j);
                if(j==3) answer += "-";
                if(aski >= 48 && aski <=57){
                    answer += aski -'0';
                }
                else if(65<= aski && aski <=67){
                    answer += "2";
                }
                else if(68<= aski && aski <=70){
                    answer += "3";
                }   
                else if(71<= aski && aski <=73){
                    answer += "4";
                }   
                else if(74<= aski && aski <=76){
                    answer += "5";
                }   
                else if(77<= aski && aski <=79){
                    answer += "6";
                }   
                else if(80 == aski || aski == 82 || aski == 83){
                    answer += "7";
                }   
                else if(84<= aski && aski <=86){
                    answer += "8";
                }   
                else if(87<= aski && aski <=89){
                    answer += "9";
                }     
            }
            answerList.add(answer);
        }
        Collections.sort(answerList);
        Set<String> set = new HashSet<String>(answerList);
        for (String str : set) {
            if(Collections.frequency(answerList, str) == 1){
                continue;
            }
            else{
                System.out.println(str + " " + Collections.frequency(answerList, str));
            }
        }
    }
}
