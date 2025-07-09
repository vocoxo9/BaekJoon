package level1;

import java.util.Scanner;

public class BaekJoon2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int b1 = (b%10) * a;
        int b2 = (b%100) / 10 * a;
        int b3 = (b/100) * a;

        System.out.printf("%d\n%d\n%d\n%d", b1, b2, b3, (a*b));
    }
}
