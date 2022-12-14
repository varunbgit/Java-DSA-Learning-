package com.varun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int imp[] = {1,1,0};
        int out[]= flipAndInvertImage(imp);
        System.out.println(Arrays.toString(out));
    }

    public  static int[] flipAndInvertImage(int[] row) {
        int C = row.length;
//        for (int[] row : A) {
            System.out.println(Arrays.toString(row));
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                System.out.println(row[i] + " Xor 1 " + tmp);
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }
        //}
        return row;
    }
}
