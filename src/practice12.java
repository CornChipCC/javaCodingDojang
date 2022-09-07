/* 1~1000 각 숫자의 개수 구하기 */
public class practice12 {
    public static void main(String[] args) {
        int[] numCount = new int[10];

        for (int i = 1; i < 1001; i++) {
            
            numCount[i%10]++;

            if( i >=10){
                numCount[i/10 % 10]++;
            }
            if(i>=100){
                numCount[i/100%10]++;
            }
            if(i>=1000){
                numCount[i/1000%10]++;
            }
        }
        for (int i = 0; i < numCount.length; i++) {
            System.out.println(i + " : " + numCount[i]);
        }
    }
}
