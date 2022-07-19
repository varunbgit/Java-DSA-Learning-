package com.varun;

public class NewtonRaphsom {
    public static void main(String[] args) {
        int n = 40;
        //sqrt 40 = 6.3224
        sqrt(n);
    }
    static void sqrt(int n){
//        root = (x+n/x)/2
        double x = n;
        double root ;
        while (true){
             root = (x+n/x)/2;
            double error  = Math.abs(root-x);

            // if we reduce the value of error we get even more precise and but it takes
            // more number of steps

            if(error < 1){
                break;
            }else
            {
                x= root;
            }
        }

        System.out.println(root);
    }

}
