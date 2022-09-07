/* 1부터 20사이의 어떤 수로도 나누어 떨어지는 가장 작은 수 */
public class practice23 {
    public static void main(String[] args) {
        int answer = 0;
        int count = 0;
        while(true){
            answer++;
            for (int i = 1; i < 21; i++) {
                if(answer % i == 0){
                    count++;
                }
                else{
                    count = 0;
                    break;
                }
            }
            if(count == 20){
                break;
            }
        }
        System.out.println(answer);
    }
}
