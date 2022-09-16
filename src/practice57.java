import java.util.ArrayList;
import java.util.Scanner;
/* CamelCase를 Pothole_case로 바꾸기! */
public class practice57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 97 || str.charAt(i) > 122){
                list.add("_");
                if(str.charAt(i) >= 65 && str.charAt(i)<=90){
                    list.add(Character.toString(str.charAt(i) + 32));
                }
                else{
                    list.add(Character.toString(str.charAt(i)));
                }
            }
            else{
                list.add(Character.toString(str.charAt(i)));
            }
        }

        for (String string : list) {
            System.out.print(string);
        }
    }
}
