package dami.Boj.Type.T2_구현;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;

public class B1076_저항 {
    public static void main(String[] args) throws IOException {
        HashMap<String, int[]> resistance = getResistance();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int first = resistance.get(br.readLine())[0];
        int second = resistance.get(br.readLine())[0];
        long third = Long.parseLong(String.valueOf(resistance.get(br.readLine())[1]));
        BigInteger result = BigInteger.valueOf(Long.parseLong(first+""+second) * third);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static HashMap getResistance() {
        HashMap<String, int[]> map = new HashMap<>();
        map.put("black", new int[]{0, 1});
        map.put("brown", new int[]{1, 10});
        map.put("red", new int[]{2, 100});
        map.put("orange", new int[]{3, 1000});
        map.put("yellow", new int[]{4, 10000});
        map.put("green", new int[]{5, 100000});
        map.put("blue", new int[]{6, 1000000});
        map.put("violet", new int[]{7, 10000000});
        map.put("grey", new int[]{8, 100000000});
        map.put("white", new int[]{9, 1000000000});
        return map;
    }
}
