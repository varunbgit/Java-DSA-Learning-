package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class flipflopsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while(test-- > 0){
            int l = in.nextInt();
            int []arr = new int[l];
            for (int i = 0; i<l ; i++) {
                arr[i] = in.nextInt();
            }


            Arrays.sort(arr);
            arr[0] = -arr[0];
            arr[1] = -arr[1];
            int sum = 0;
            for (int ele : arr){
                sum += ele;
            }

            System.out.println(sum);
        }
    }
}

//1
//5
//-1 1 1 -1 -1

