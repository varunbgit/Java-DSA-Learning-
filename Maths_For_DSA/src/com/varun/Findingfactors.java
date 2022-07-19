package com.varun;

import java.util.ArrayList;

public class Findingfactors {
    public static void main(String[] args) {
        int n =60;
        factors(n);
    }
    static void factors(int n){
       int  count =2;
        ArrayList<Integer> elements = new ArrayList<Integer>();
       while(count * count <= n){
           if(n % count == 0){
               System.out.println(count + " ");
               elements.add(n/count);
           }
           count++;
       }
       // taking elements in reverse as the elements are stored in desecnding order
        for (int i = elements.size()-1; i >=0 ; i--) {
            System.out.println(elements.get(i));
        }
    }
}
