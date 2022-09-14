import java.util.ArrayList;
import java.util.Scanner;
/* Light More Light */
public class practice40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lightList = new ArrayList<Integer>();
        while(true){
            int input = sc.nextInt();
            if(input == 0) break;
            else{
                lightList.add(input);
            }
        }
        int switchCount = 0;
        for (int i = 0; i < lightList.size(); i++) {
            switchCount = 0;
            for (int j = 1; j <= lightList.get(i); j++) {
                if(lightList.get(i) % j == 0){
                    switchCount++;
                }
            }
            if(switchCount % 2 == 0){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
