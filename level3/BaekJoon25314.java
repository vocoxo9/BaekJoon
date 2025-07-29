package level3;

import java.util.Scanner;

public class BaekJoon25314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = n/4;

        for (int i = 0; i < b; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
