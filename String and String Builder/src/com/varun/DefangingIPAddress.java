package com.varun;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }
    //using string instead of String Builder results in Very high difference in Time complexity




    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <address.length() ; i++) {
            if(address.charAt(i) == '.'){
                ans.append("[.]");
            }else{
                ans.append(address.charAt(i));
            }
        }
        return ans.toString();
    }
}
