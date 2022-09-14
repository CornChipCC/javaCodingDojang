import java.util.ArrayList;
import java.util.Scanner;

/* Jolly Jumpers */
public class practice38 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList<Integer> checkList = new ArrayList<Integer>();
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("입력 하세요.");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            numList.add(sc.nextInt());
            if(i != 0){
                checkList.add(i);
            }
        }
        
        for (int i = 1; i < numList.size(); i++) {
            int temp = numList.get(i) - numList.get(i-1);
            if(temp <0) temp *= -1;
            if(temp == 0 || temp > size) break;

            for (int j = 0; j < checkList.size(); j++) {
                if(temp == checkList.get(j)){
                    count++;
                    checkList.set(j, 0);
                }
            }            
        }

        if(count == size-1){
            System.out.println("Jolly");
        }
        else{
            System.out.println("Not Jolly");
        }
    }
}
