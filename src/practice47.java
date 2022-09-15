import java.util.ArrayList;
import java.util.Scanner;

/* Bubble Sort */
public class practice47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        
        System.out.println("input data : (첫 숫자는 입력받을 숫자 수)");

        int rule = sc.nextInt();

        for (int i = 0; i < rule; i++) {
            numList.add(sc.nextInt());
        }

        int swapCount = 0;
        int loopCount = 0;
        while(true){
            int breakCount = 0;
            for (int i = 0; i < numList.size()-1; i++) {
                if(numList.get(i) > numList.get(i+1)){
                    int temp = numList.get(i);
                    numList.set(i, numList.get(i+1));
                    numList.set(i+1, temp);
                    swapCount++;
                    breakCount++;
                }
            }
            loopCount++;
            if(breakCount == 0) break;
        }
        System.out.println(loopCount + " " + swapCount);
    }    
}
