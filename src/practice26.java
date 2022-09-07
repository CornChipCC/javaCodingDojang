import java.util.Scanner;

/* 공백, 줄바꿈을 제외한 글자수 세기 */
public class practice26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        
        System.out.println("문자열을 입력해주세요 : (exit 입력시 종료)");   
        while (sc.hasNext()) {
            String str = sc.next();
            if(str.equals("exit")){
                break;
            }       
            cnt += str.length(); 
        }
        System.out.println(cnt);

    }
}