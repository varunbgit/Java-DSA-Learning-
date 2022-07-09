package com.varun;

public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
       // StringBuilder ans = new StringBuilder("");
//         String num ="1";
//        //num = ((char) num);
//        while(true){
//            int index=0;
//            for(char c :s.toCharArray()){
//
//                if(c==(char)(num)){
//                    int i=0;
//                    for ( i = index; s.charAt(i)!=' ' && i>0; i--) {
//                        //we have index as the last index of word and i as firstindex of word
//                        ans.append(s.substring(i,index));
//                    }
//                }
//                index++;
//            }
//            break;
//        }
        String [] arr  = s.split(" ");
        String[] sorted = new String[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int pos = arr[i].charAt(arr[i].length()-1) - '0';
            sorted[pos-1] = arr[i].substring(0,arr[i].length()-1);
        }
        StringBuilder ans  = new StringBuilder("");
        for (int i = 0; i < sorted.length-1 ; i++) {
            ans.append(sorted[i]);
            ans.append(" ");
        }
        ans.append(sorted[sorted.length-1]);  //did'nt keep this in for loop because there a extra space at last was also comming
        return ans.toString();
    }
}
