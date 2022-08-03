package com.varun;
//https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion

public class FindLenghtofStringusingRecursion {
    public static void main(String[] args) {
        String s  = "Rajputsinghsanu";
        int ans = recLen(s);
        System.out.println(ans);
    }

    private static int recLen(String s) {

        if(s == ""){
            return 0;
        }
        StringBuilder nstr = new StringBuilder();
       if(s.length() > 1){
           nstr.append(s,0,s.length()-1);
       }
        String newS = nstr.toString();

        return recLen(newS) +1;
    }
}
