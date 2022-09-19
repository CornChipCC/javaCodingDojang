import java.util.ArrayList;

/* 120번째 죄수 */
public class practice64 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 120; i++) {
            list.add(0);    
        }
        for (int i = 1; i <= 120; i++) {
            for (int j = 1; j <= 120; j++) {
                if (i % j == 0){
                    list.set(i-1, list.get(i -1)+1);
                }
            }
            
        }
        int answerCount = 0;
        for (Integer integer : list) {
            if(integer % 2 ==1 ) answerCount++;
        }

        System.out.println(answerCount);
    }
}
