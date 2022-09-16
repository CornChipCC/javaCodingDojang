import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/* 카드 역배치(2015년 KOI 지역본선 고등) */
public class practice58 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> cardList = new ArrayList<>();
        
        for (int i = 1; i <= 20; i++) {
            cardList.add(i);
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            numList.add(sc.nextInt());
        }

        for (int i = 0; i < numList.size() ; i+=2) {
            int start = numList.get(i);
            int end = numList.get(i+1);
            
            int count = 1;
            int limit = end - start;
            if(limit % 2 == 1){
                limit = limit/2 +1;
            }
            else{
                limit /= 2;
            }
            for (int j = 0; j < limit; j++){
                Collections.swap(cardList, start-1, end-count);
                count++;
                start++;
            }
        }

        for (Integer integer : cardList) {
            System.out.print(integer + " ");
        }
    }
}
