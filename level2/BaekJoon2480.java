package level2;

import java.util.Scanner;

public class BaekJoon2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a==b && b==c){
            System.out.println(10000 + a*1000);
        } else if (a==b || a==c){
            System.out.println(1000 + a*100);
        } else if (b==c){
            System.out.println(1000 + b*100);
        } else {
            int max;
            if ( a>b && a>c){
                max = a;
            } else if (b>a && b>c){
                max = b;
            } else {
                max = c;
            }
            System.out.println(max*100);
            // System.out.print((Math.max(Math.max(a, b), c)*100));
        }
    }
}
