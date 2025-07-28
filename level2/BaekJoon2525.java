package level2;

import java.util.Scanner;

public class BaekJoon2525 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int time = (h*60) + m + c;

        h = time/60;
        m = time%60;

        if(h >= 24 ){
            h = h -24;
        }
        System.out.printf("%d %d", h,m);
    }
}
