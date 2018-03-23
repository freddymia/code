package ec.codemonk.basics;

import java.util.Scanner;

public class BirthdayParty {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- > 0) {

            int n = s.nextInt();
            int m = s.nextInt();

            System.out.println((m % n == 0) ? "Yes" : "No");

        }

        s.close();

    }

}
