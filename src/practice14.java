import java.util.ArrayList;
import java.util.Scanner;
import java.util.IntSummaryStatistics;
public class practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자연수를 입력하세요 : ");
        int inputNum = sc.nextInt();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        for (int i = 1; i < inputNum+1; i++) {
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    numList.add(j);
                }
            }
            int sum = 0;
            for (Integer integer : numList) {
                sum += integer;
            }
            if(sum == i){
                answerList.add(i);
            }
            numList.clear();
        }

        for (Integer integer : answerList) {
            System.out.println(integer);
        }
    }
}
