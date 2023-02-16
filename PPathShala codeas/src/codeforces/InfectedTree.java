package codeforces;

//import com.sun.source.tree.Tree;

//import com.sun.source.tree.Tree;

//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class InfectedTree {
    static int[] subChild ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while(test -- > 0){
            int n = in.nextInt();
            ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
            for (int i = 1; i <=n+1 ; i++) {
                ar.add(new ArrayList<>());
            }


            for (int i = 0; i <n-1 ; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                ar.get(u).add(v);
                ar.get(v).add(u);
            }
            subChild = new int[n+1];
            dfs(1,-1,subChild,ar);
//            System.out.println(Arrays.toString(subChild));
            System.out.println(infection(1,-1,subChild,ar));


        }
    }

    static void dfs (int root,int parent,int [] subChild,ArrayList<ArrayList<Integer>> adj){

        int count = 0;
        for(int ele :  adj.get(root)){

            if(parent != ele){
                dfs(ele,root,subChild,adj);
                count += subChild[ele];
                count ++;
            }

        }
        subChild[root] = count;
    }


    static int infection (int  root,int parent,int[] subChild,ArrayList<ArrayList<Integer>> adj){
        int ans = 0;
        int countofSubNodes=0;

        for(int ele : adj.get(root)){
            if(ele != parent){
                if(ans == 0) {
                    ans = subChild[ele];
                }
                countofSubNodes += subChild[ele];
            }

        }

        for(int ele : adj.get(root)){
            if(ele!=parent){
                ans = Math.max(ans,infection(ele,root,subChild,adj) + countofSubNodes - subChild[ele] );
            }
        }
        return ans;


    }
}
