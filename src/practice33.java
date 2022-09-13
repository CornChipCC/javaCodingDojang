import java.util.ArrayList;
import java.util.Scanner;

/* Primary Arithmetic */
public class practice33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        System.out.println("입력하세요 : ");

        while (sc.hasNext()) {
            int input = sc.nextInt();
            if(input == 0){
                break;
            }
            else{
                numList.add(input);
            }
        }

        for (int i = 1; i < numList.size(); i+=2) {
            int temp1 = numList.get(i-1);
            int temp2 = numList.get(i);
            int carryCount = 0;
            for (int j = 1; ; ) {

                if(temp1 / j == 0 || temp2 / j == 0) break;

                int carry1 = temp1 / j % 10;
                int carry2 = temp2 / j % 10;
                if(carry1 + carry2 > 9 ) carryCount++;
                
                j *=10;
            }
            if(carryCount==0){
                System.out.println("No carry opration.");
            }
            else{
                System.out.println(carryCount + " carry operations.");
            }
        }
    }
}
