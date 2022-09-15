import java.util.ArrayList;
import java.util.Scanner;

/* Insertion Sort */
public class practice45 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력 하세요.(0입력시 종료)");
        while(sc.hasNext()){
            int input = sc.nextInt();
            if(input == 0) break;
            else{
                numList.add(input);
            }
        }

        for (int i = 1; i < numList.size(); i++) {
            for (int j = 0; j < i; j++) {
                if(numList.get(i) < numList.get(j)){
                    numList.add(j, numList.get(i));
                    numList.remove(i+1);
                }
            }
        }

        for (Integer integer : numList) {
            System.out.println(integer);
        }
    }
}
