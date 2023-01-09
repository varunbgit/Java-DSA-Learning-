package practice;

public class Transformation {
    public static void main(String[] args) {
        int a = 4;
        int b = 42;
        int ans = transform(a,b);
        if(ans != -1)
            System.out.println(ans);

    }
    public static int transform(int a ,int b ){
        int c = b;
        int count = 1;
        while (true){
            if(c  == a){
                System.out.println("Yes");
                return count ;
            }
            if(c < a){
                System.out.println("No");
                return -1;
            }
            if(c%2 == 1){
                c-=1;
                c/=10;

            }else{
                c/=2;
            }
            count++;
        }
    }
//    public static int transformRec(int a ,int b ){
//
//    }
}
