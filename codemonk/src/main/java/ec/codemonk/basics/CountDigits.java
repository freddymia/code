package ec.codemonk.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String srt = s.next();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int i = 0;
        while (i++ < srt.length()) {
            Integer intVal = Integer.parseInt(String.valueOf(srt.charAt(i-1)));
            if (map.containsKey(intVal)) {
                map.put(intVal, map.get(intVal) + 1);
            }else {
                map.put(intVal, 1);
            }
        }

        for (int j = 0; j < 10; j++) {

            Integer oc = 0;

            if (map.containsKey(j)) {
                oc = map.get(j);
            }

            System.out.println(j + " " + oc);

        }

        s.close();
    }

}
