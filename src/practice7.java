
/* 3이 나타나는 시간을 전부 합치면? */

public class practice7 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                int minOne = (j % 10);
                int minTen = (j / 10);
                int hourOne = i % 10;
                int hourTen = i / 10;
                if(hourOne == 3 || hourTen == 3 || minOne == 3 || minTen == 3){
                    count++;
                }
            }
            
        }

        System.out.println(count * 60);
    }
}
