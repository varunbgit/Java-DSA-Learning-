package codeforces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class newsDistribution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int test = in.nextInt();
//        while(test-- >0){
        int n = in.nextInt();
        int grp = in.nextInt();
        ArrayList<Long> sp = new ArrayList<>();
        ArrayList<Long> size = new ArrayList<>();
        for (long i = 0; i <= n; i++) {
            size.add((int) (i), (long) (1));
        }
        for (long i = 0; i <= n; i++) {
            sp.add(i);
        }
        System.out.println(sp.toString());
        System.out.println(size.toString());

        for (int i = 0; i < grp; i++) {
            long sz = in.nextInt();
            long prev = -1;
            for (int j = 0; j < sz; j++) {
                int curr = in.nextInt();
                if (prev != -1) {
                    prev = curr;
                    long sp1 = findsp(prev, sp);
                    long sp2 = findsp(curr, sp);
                    if (sp1 == sp2) {
                        continue;
                    }
                    if (size.get((int) (sp1)) > size.get((int) (sp2))) {
                        sp.add((int) (sp2), sp1);
                        size.add((int) (sp1), sp1 + sp2);
                    } else {
                        sp.add((int) (sp1), sp2);
                        size.add((int) (sp2), sp1 + sp2);
                    }

                }

                prev = curr;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(sp.get(i));
        }
//    }
    }

    public static long findsp(long e,ArrayList<Long> sp){
        if(sp.get((int) e) == e){
            return e;
        }
        sp.add((int) e,findsp(sp.get((int) e),sp));
        return sp.get((int) e);
    }
}


