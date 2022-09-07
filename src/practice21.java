
/* palindrome(대칭수) */
public class practice21 {
    public static void main(String[] args) {
        int answer = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int temp = i * j;
                if(temp > 99999){                           //6자리 수 일때
                    if(temp/100000 == temp %10 && temp/10000%10 == temp%100/10 && temp/1000%10 == temp%1000/100){
                        if(answer < temp){
                            answer = temp;
                        }
                    }
                }
                else{                                       //5자리 수 일때
                    if(temp/10000 == temp%10 && temp/1000%10 == temp%100/10){
                        if(answer < temp){
                            answer = temp;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
