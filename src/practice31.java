import java.util.ArrayList;

/* 넥슨 입사문제(셀프넘버 찾기) */
public class practice31 {
    public static void main(String[] args) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int i = 0;
        for (int j = 1; j < 5000; j++) {
            int temp = 0;
            temp = j/1000 + (j/100%10) + (j/10%10) + j%10 + j;
            if(temp<5000){
                answerList.add(temp);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (Integer a : answerList) {
            if(!resultList.contains(a)){
                resultList.add(a);
            }
        }
        int sum = 0;
        for (Integer b : resultList) {
            sum+= b;
        }
        int sum2 = 0;
        for (int j = 0; j < 5000; j++) {
            sum2+=j;
        }

        System.out.println(sum2 - sum);

    }
}
