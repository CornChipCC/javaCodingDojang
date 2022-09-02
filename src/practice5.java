import java.util.ArrayList;

/* Special Sort */

public class practice5 {
    public static void main(String[] args) {
        ArrayList<Integer> minusList = new ArrayList<Integer>();
        ArrayList<Integer> plusList = new ArrayList<Integer>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        

        int[] originList = {-1,1,3,-2,2};

        for (int i = 0; i < originList.length; i++) {
            if(originList[i] < 0){
                minusList.add(originList[i]);
            }
            else{
                plusList.add(originList[i]);
            }
        }
        answerList.addAll(minusList);
        answerList.addAll(plusList);

        for (int i : answerList) {
            System.out.print(i + " ");
        }
    }
}
