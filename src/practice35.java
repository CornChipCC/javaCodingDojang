import java.util.ArrayList;
import java.util.Scanner;

/* 다음 입사문제 중에서 */
/* 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수 */
public class practice35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dotList = new ArrayList<Integer>();
        System.out.println("숫자들을 입력하세요.(exit 입력시 종료)");

        while(sc.hasNext()){
            String temp = sc.next();
            if(temp.equals("exit")) break;
            else{
                dotList.add(Integer.parseInt(temp));
            }
        }

        int min = 999999;
        for (int i = 0; i < dotList.size(); i++) {
            for (int j = 0; j < dotList.size(); j++) {
                if(j <= i) continue;
                int temp = dotList.get(j) - dotList.get(i);
                if(temp < min){
                    min = temp;
                }
            }
        }

        for (int i = 0; i < dotList.size(); i++) {
            for (int j = 0; j < dotList.size(); j++) {
                if(j <= i) continue;
                int temp = dotList.get(j) - dotList.get(i);
                if(temp == min){
                    System.out.println("(" + dotList.get(i) + "," + dotList.get(j) + ")");
                }
            }
        }
    }
}
