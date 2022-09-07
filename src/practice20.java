/* 10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기 */
public class practice20 {
    public static void main(String[] args) {

        int sum = 0;
        int oneNum = 0;
        int tenNum = 0;
        int hundredNum = 0;

        for (int i = 10; i < 1000; i++) {
            
            if(i <100){
                oneNum = i % 10;
                tenNum = i / 10;
                
                sum += tenNum * oneNum;
            }
            else{
                oneNum = i % 10;
                tenNum = i / 10 %10;
                hundredNum = i/100;
                sum += hundredNum * tenNum * oneNum;
            }
        }

        System.out.println(sum);
    }
}
