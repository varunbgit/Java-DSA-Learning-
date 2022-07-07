package com.varun;
//1678. Goal Parser Interpretation
public class Goal_Parser_interpretation {
    public static void main(String[] args) {
        String s = "G()(al)";
        System.out.println(interpret(s));
    }
    public static String interpret(String command) {
        StringBuilder ans  =  new StringBuilder("");
        for (int i = 0; i <command.length(); i++) {
            if(command.charAt(i)  == 'G'){
                ans.append('G');
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                ans.append("al");
                i= i +3;
            }else{
                ans.append('o');
                i++;
            }
        }
        return ans.toString();
    }

}
