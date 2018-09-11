package ec.codemonk.basics.bit.manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mystery {

    public static void main(String[] args) throws Exception {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            if (br.readLine() != "") {
                long number = Long.parseLong(br.readLine());
                String binary = Long.toBinaryString(number);
                System.out.println(binary.replaceAll("0", "").length());
            }
        }
    }

}
