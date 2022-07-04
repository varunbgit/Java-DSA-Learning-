package com.varun;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        String s = "V";
//       String c =  s.charAt(0)-'A'-'a';
//        char c = 'C';
//
//        char ans = 'C' -'A'+'a';
//        System.out.println(ans);

        String strs[] = {"Arshad", "Althamas", "Johar", "Javed", "Raju", "Krishna" };
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        sb.append(" "+strs[1]);
        sb.append(" "+strs[2]);
        sb.append(" "+strs[3]);
        sb.append(" "+strs[4]);
        sb.append(" "+strs[5]);
        String singleString = sb.toString();
        System.out.println(singleString);

    }
}
