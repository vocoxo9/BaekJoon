package level2;

import java.util.Scanner;

public class BaekJoon2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (45<= m && m <= 59){
            m = m - 45;
            System.out.printf("%d %d",h,m);
        } else if (0 <= m && m <= 45){
            if(h == 0){
                h = 23;
            } else {
                h = h - 1;
            }
            m = m - 45 + 60;
            System.out.printf("%d %d",h,m);
        }
    }
}
