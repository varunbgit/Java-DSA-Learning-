package com.varun;



public class Palindrome_Code2 {
    public static void main(String[] args) {
        String s ="a???c??c????";

        int ans = minimumSum(s);
        System.out.println(ans);
    }
    public static int minimumSum(String s) {
        // code here
        StringBuilder ans = new StringBuilder(s);
        char letter = (char)(ans.charAt(0)-1);
        for (int i = 0; i < s.length()/2; i++) {
            if (ans.charAt(i) != ans.charAt(ans.length() - i-1)  && ans.charAt(ans.length() - i-1) != '?' ) {
                return -1;
            }

            if ( s.charAt(i) != '?' && ans.charAt(s.length() - i-1) == '?'){
                ans.setCharAt(s.length() - i-1, ans.charAt(i));
            }
                if(ans.charAt(i) != '?') {
                  letter = (char) (ans.charAt(i) + 1);
                }
                if( ans.charAt(i)!= ans.charAt(ans.length() - i-1)){
                    letter = ans.charAt(i);
                }
            if ( s.charAt(i) == '?' && ans.charAt(s.length() - i-1) == '?') {

                ans.setCharAt(i,letter);
                ans.setCharAt(s.length() - i-1,  ans.charAt(i));
            }

        }
        System.out.println(ans);
        int a =0 ;
        for (int i = 1; i <ans.length() ; i++) {
            int check = ans.charAt(i)-ans.charAt(i-1);

            if(check<0){
                check = check * (-1);
            }
            a +=check;
        }
        return a;
    }
}
