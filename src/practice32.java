/* 구글 입사문제 중에서 */
/* 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가? */
public class practice32 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 10000; i++) {
            int thousand = i/1000;
            int hundred = i/100%10;
            int ten = i/10%10;
            int one = i%10;

            if(thousand == 8) count++;    
            if(hundred == 8) count++; 
            if(ten == 8) count++; 
            if(one == 8) count++; 
        }
        System.out.println(count);
    }
}
