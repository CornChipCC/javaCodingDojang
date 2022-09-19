import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 트럭 */
public class practice66 {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
        int n = scan.nextInt();  //트럭의 수
        int w = scan.nextInt();  //다리의 길이
        int L = scan.nextInt();  //다리의 최대하중
        ArrayList<Integer> start = new ArrayList<Integer>();
        ArrayList<Integer> bridge = new ArrayList<Integer>();

        for(int i=0; i<n; i++) {
            start.add(scan.nextInt());
        }

        for(int i=0; i<w; i++) {
            bridge.add(0);
        }
        int sum = bridge.stream().mapToInt(Integer::intValue).sum();
        bridge.set(bridge.size()-1, start.get(0));
        sum = bridge.stream().mapToInt(Integer::intValue).sum();
        int time = 1;
        start.remove(0);

        for(int j=0;;j++) {
            if(start.size()==0) {
                time+=w;
                break;
            }
            if(sum<=L) {
                if(bridge.get(0)!=0) {
                    bridge.set(0, 0);
                    sum = bridge.stream().mapToInt(Integer::intValue).sum();
                }
                Collections.rotate(bridge, -1);
                bridge.set(bridge.size()-1, start.get(0));
                sum = bridge.stream().mapToInt(Integer::intValue).sum();
                if(sum>L) {
                    bridge.set(bridge.size()-1, 0);
                    sum = bridge.stream().mapToInt(Integer::intValue).sum();
                }
                else {
                    start.remove(0);
                }
                time++;
            }
        }
        System.out.println(time);

    }
}
