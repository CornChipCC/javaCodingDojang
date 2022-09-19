/* Smallest multiple */
public class practice68 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2520; ; i++) {
            count = 0;
            for (int j = 1; j <= 20; j++) {
                if(i % j != 0) break;
                else count++;
            }
            if(count == 20){
                System.out.println(i);
                break;
            }
        }
    }
}
