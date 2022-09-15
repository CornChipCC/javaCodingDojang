import java.util.ArrayList;
import java.util.Scanner;

/* Two Printers */
public class practice48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        
        System.out.println("input data : (첫 숫자는 입력받을 숫자 수)");

        int rule = sc.nextInt();

        for (int i = 0; i < rule*3; i++) {
            numList.add(sc.nextInt());
        }

        for (int i = 0; i < rule; i++) {
            int firstSec = numList.get(i * 3);
            int lastSec = numList.get(i * 3 + 1);
            int printPage = numList.get(i * 3  + 2);
            
            int secCount = 0;
            while(true){
                secCount++;
                if(secCount % firstSec == 0){
                    printPage--;
                }
                if(secCount % lastSec == 0){
                    printPage--;
                }
                if(printPage <= 0) break;
            }
            System.out.print(secCount + " ");
        }        
    }
}
