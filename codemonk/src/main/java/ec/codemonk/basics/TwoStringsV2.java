package ec.codemonk.basics;

import java.util.Scanner;

public class TwoStringsV2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numberTest = s.nextInt();

        while (numberTest-- > 0) {

            String s1 = s.next();
            String s2 = s.next();

            System.out.println(compare(s1, s2));
        }

        s.close();
    }

    public static String compare(String s1, String s2) {

        if (s1.length() == s2.length()) {

            while (s1.length() > 0) {
                if (s2.contains(String.valueOf(s1.charAt(0)))) {
                    s2 = s2.replaceFirst(String.valueOf(s1.charAt(0)), "");
                } else {
                    return "NO";
                }
                s1 = s1.substring(1, s1.length());
            }

            if (s2.length() == 0) {
                return "YES";
            } else {
                return "NO";
            }

        } else {
            return "NO";
        }

    }

}
