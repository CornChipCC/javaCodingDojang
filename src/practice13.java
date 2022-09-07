import java.util.ArrayList;
import java.util.Scanner;

/* Dash Insert */
public class practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요. : ");
        String[] str = sc.nextLine().split("");
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        
        int oddCount = 0;
        int evenCount = 0;
        
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).equals("-") || list.get(i).equals("*")){
                continue;
            }
            if(list.get(i-1).equals("-") || list.get(i-1).equals("*")){
                continue;
            }
            int num = Integer.parseInt(list.get(i));
            int num2 = Integer.parseInt(list.get(i-1));
            
            
            if(num % 2 == num2 % 2){
                if(num % 2 == 1){
                    list.add(i, "-");
                }
                else{
                    list.add(i,"*");
                }
            }
        }

        for (String string : list) {
            System.out.print(string);
        }

    }
}
