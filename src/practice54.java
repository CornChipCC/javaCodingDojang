import java.util.Scanner;

/* 모스부호 해독 */
public class practice54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mos = sc.nextLine();
        String[] mosList = mos.split(" ");
        String answer = "";

        String[] mosRule = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.","....", "..", ".---", "-.-", ".-..", "--" , "-.", "---", ".--.", "--.-", ".-.", "..." , "-",
                            "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        String[] words = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i < mosList.length; i++) {
            if(mosList[i].isEmpty()){
                answer += " ";
                System.out.println("공백");
            }
            for (int j = 0; j < mosRule.length; j++) {
                if(mosList[i].equals(mosRule[j])){
                    answer += words[j];
                    System.out.println("일치");
                }
            }
        }
        System.out.println(answer);        
    }
}
