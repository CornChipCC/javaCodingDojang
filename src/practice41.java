import java.util.ArrayList;
import java.util.Scanner;

/* Ones */
public class practice41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        while(true){
            int temp = sc.nextInt();
            if(temp == 0) break;
            if(temp % 2 != 0 && temp % 5 != 0){
                numList.add(temp);
            }
            else{
                System.out.println("2나 5로 나눌수 없는 값만 입력해주세요!!");
            }
        }
        int count = 0;
        int j = 1;
        for (int j2 = 0; j2 < numList.size(); j2++) {
            long k = (long)numList.get(j2);

            while(k!=0){
                if(k %10 == 1){
                    k = (k-1) /10;
                    count++;
                }
                else{
                    count= 0;
                    j++;
                    k = (long)numList.get(j2) * j;
                }
            }
            System.out.println(count);
        }
    }
}
