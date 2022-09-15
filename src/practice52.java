import java.util.Scanner;
/* 문자열 압축하기 */
public class practice52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String data = sc.nextLine() + " ", anw = "";
        int count = 1;
        System.out.println(data);
        for (int i = 0; i < data.length() - 1; i++)
            if (data.charAt(i) == data.charAt(i + 1))
                count++;
            else {
                anw += data.charAt(i) + (count + "");
                count = 1;
            }
        System.out.println(anw);
    }
}
