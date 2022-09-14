import java.util.ArrayList;
import java.util.Scanner;

/* Reverse And Add */
public class practice42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        int rule = sc.nextInt();

        for (int i = 0; i < rule; i++) {
            numList.add(sc.nextInt());
        }

        for (int i = 0; i < numList.size(); i++) {
            int count = 0;
            int temp = numList.get(i);
            while(true){
                int reverseNum = 0;
                int numSize = 1;
                int temp2 = temp;
                //자릿수 구하기
                while(temp2 /10 != 0){
                    numSize++;
                    temp2 = temp2 / 10;
                }
                
                // 거꾸로 수 구하기
                int temp3 = temp;
                for (int j = numSize-1; j >= 0; j--) {
                    reverseNum += (temp3 % 10) * Math.pow(10, j);
                    temp3 = temp3/10;
                }
                if(reverseNum == temp) {
                    System.out.println(count + " " + temp);
                    break;
                }
                else{
                    temp += reverseNum;
                    count++;
                }
            }
        }
    }
}
