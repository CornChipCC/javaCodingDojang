import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* h-index & g-index */
public class practice59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        System.out.println("인용 횟수 입력 : (숫자 말고 다른거 입력시 종료)");
        while(sc.hasNextInt()){
            numList.add(sc.nextInt());
        }
        Collections.sort(numList);
        int hIndex = 0;
        int gIndex = 0;
        for (int i = 0; i<numList.get(numList.size()-1) ; i++) {
            int count = 0;
            for (int j = 0; j < numList.size(); j++) {
                if(i >= numList.get(j)){
                    count++;
                }
            }
            if(i == count && count > hIndex){
                hIndex = count;
            }
        }

        for (int i = 1; i <= numList.size(); i++) {   //i = g -index
            int sum = 0;
            for (int j = numList.size()-1; j >= numList.size()-i; j--) {
                sum += numList.get(j);
            }
            if(sum >= i * i){
                gIndex = i;
            }
        }
        System.out.println("h-index : " + hIndex);
        System.out.println("g-index : " + gIndex);
    }
}
