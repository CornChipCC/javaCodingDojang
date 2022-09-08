import java.util.ArrayList;
import java.util.Scanner;
/* 자신을 제외한 곱셈 */
public class practice27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        System.out.println("숫자 4개를 입력하세요.");
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        int temp = 1;
        for (int i = 0; i < list.size(); i++) {
            temp = 1;
            for (int j = 0; j < list.size(); j++) {
                
                if(i == j){
                    continue;
                }
                temp *= list.get(j);
            }
            answerList.add(temp);
        }

        for (Integer integer : answerList) {
            System.out.println(integer);
        }
    }
}
