import java.util.Scanner;

/* 게시판 페이징 */
public class practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("총 건수, 한 페이지에 보여줄 게시물 수 입력 :(공백으로 구분)");

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if(n <1){
            System.out.println("n은 0보다 커야합니다.");
            return;
        }
        int answer = pageTotal(m, n);
        System.out.println(answer);
    }

    public static int pageTotal(int m, int n) {

        int answer = 0;

        answer += m/n;

        if(m % n != 0){
            answer += 1;
        }

        return answer;
    }
}
