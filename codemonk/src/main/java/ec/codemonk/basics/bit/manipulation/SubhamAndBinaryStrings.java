package ec.codemonk.basics.bit.manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubhamAndBinaryStrings {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberTest = Integer.parseInt(br.readLine());

        while (numberTest-- > 0) {
            int sizeStr = Integer.parseInt(br.readLine());
            String str = br.readLine();

            moving(str, sizeStr);

        }
    }

    static void moving(String str, int sizeStr) {
        String sn = "";
        for (int i = 1; i < sizeStr; i++) {
            sn = str.substring(i, sizeStr) + str.substring(0, i);
            System.out.println(sn);
        }
    }

}
