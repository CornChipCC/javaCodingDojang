import java.util.ArrayList;

/* 최단경로의 경우의 수 */
public class practice74 {
    public static void main(String[] args) {
        String[][] list = {
            {"A", "0", "0", "0"},
            {"0", "0", "0", "0"},
            {"0", "0", "S", "0"},
            {"0", "0", "0", "B"}};
        
        int startX = 0;
        int startY = 0;
        ArrayList<Integer> dist = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if(list[i][j].equals("S")){
                    int sX = i;
                    int sY = j;
                    int xDist = sX - startX;
                    int yDist = sY - startY;
                    if(xDist < 0) xDist*=-1;
                    if(yDist < 0) yDist*=-1;
                    dist.add(fac((xDist) + (yDist)) / (fac(xDist) * fac(yDist)));
                    startX = i;
                    startY = j;
                }
                else if(list[i][j].equals("B")){
                    int bX = i;
                    int bY = j;
                    int xDist = bX - startX;
                    int yDist = bY - startY;
                    if(xDist < 0) xDist*=-1;
                    if(yDist < 0) yDist*=-1;
                    dist.add(fac((xDist) + (yDist)) / (fac(xDist) * fac(yDist)));
                }
            }
        }
        int answer = 1;
        for (Integer integer : dist) {
            System.out.println(integer);
            answer *= integer;
        }
        System.out.println(answer);
    }

    private static int fac(int num) {
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }

}
