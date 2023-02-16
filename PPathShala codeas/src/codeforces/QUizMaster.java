package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QUizMaster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int no = in.nextInt();
        while (no-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);
            ArrayList<Integer> can = new ArrayList<>();
//
            for (int i = m; i >=2 ; i--) {

                int j;
                    for ( j = n-1; j >=0 ; j--) {
                        if (arr[j] % i == 0) {
                            if (!can.contains(arr[j])) {
                                can.add(arr[j]);
                                break;
                            }else{
                                break;
                            }
                        }
                    }
                    if(j == -1){
                        System.out.println(-1);
                        break;
                    }


            }

            Collections.sort(can);
            System.out.println(can.toString());
            System.out.println(can.get(can.size()-1) - can.get(0));
        }
    }
}
