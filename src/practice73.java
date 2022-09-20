import java.util.ArrayList;
/* 자릿수를 뒤바꿔 곱했을 때 증가수가 되는 수  */
public class practice73 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> reverseList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    numList.add(i*100 + j*10 + k);
                    reverseList.add(k*100 + j*10 + i);
                }
            }
        }

        for (int i = 0; i < numList.size(); i++) {
            answerList.add(numList.get(i) * reverseList.get(i));
        }
        
        int answerCount = 0;
        for (Integer integer : answerList) {
            String temp = Integer.toString(integer);
            int max = 0;
            int count = 0;
            for (int i = 0; i < temp.length(); i++) {
                if((temp.charAt(i) -'0') >= max){
                    max = temp.charAt(i)-'0';
                    count++;
                }
                else break;
            }
            if(count == temp.length()) {
                answerCount++;
            }
        }
        System.out.println(answerCount);
    }
}
