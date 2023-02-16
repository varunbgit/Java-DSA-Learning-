package codeforces;

import java.util.Scanner;

public class EverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int no = in.nextInt();
        while(no--  > 0){
            int n =  in.nextInt();
            int []arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
            }

            int count = 0 ;
            if(n ==1){
                System.out.println(count);
                break;
            }
            int prev = arr[0];
            int  i = 1;
            while (i<n){
                if((prev * arr[i])%2  ==1 || (prev %2 ==0 && arr[i]%2 ==0)){
                    count++;
                    prev = prev* arr[i];
                }else{
                    prev = arr[i];
                }
                i++;
            }
            System.out.println(count);
        }
    }
}
