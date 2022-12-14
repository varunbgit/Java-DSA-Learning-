package com.varun;

//832. Flipping an Image

import java.sql.SQLOutput;
import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        for (int[] value : image) {
            for (int j = 0; j < image[1].length; j++) {
                System.out.print(value[j] + " ");
            }
            System.out.print("         ");
        }
        System.out.println();
        int [][]output = flipAndInvertImage(image);
        System.out.println("Final output after function returns ");

        for (int[] ints : output) {
                            System.out.println(Arrays.toString(ints));
            }
            System.out.println(" ");
        }

//        int []test={1,1,0};
//        int [] ans = reverse(test);
//        System.out.println(Arrays.toString(ans));


//    public static int [] reverse(int [] arr){
//        int[] temp = new int [arr.length];
//        for(int i=0;i< arr.length/2;i++){
//            int var =arr[i];
//            arr[i]=arr[arr.length-1];
//            arr[arr.length-i-1]=var;
//            //temp[i]=arr[arr.length-i-1];
//        }
////        temp=arr;
//        return arr;
//    }




//  MY Approach

//    public  static int[][] flipAndInvertImage(int[][] image) {
//        System.out.println();
//        System.out.println("Array in Fun before processing ");
//
//
//        for (int i=0;i<image.length;i++){
//            for(int j =0;j< image[1].length;j++){
//                System.out.print(image[i][j]+" ");
//            }
//            System.out.print("         ");
//        }
//        System.out.println();
//
//        //int [][]output  = new int [image.length][image[1].length];
//        //int [][]temp  = new int [image.length][image[1].length];
//
//        for(int i =0;i<image.length;i++){
//            System.out.println(i+ " rows is being printed before horizontal flip "+Arrays.toString(image[i]));
//            for(int j=0;j<image[i].length/2;j++){
//                 int var=image[i][j];
//                 image[i][j]=image[i][image[i].length-j-1];
//                 image[i][image[i].length-j-1]=var;
//             }
//            System.out.println(i+ " rows is being printed "+Arrays.toString(image[i]));
//        }
//        //horiontal filp done
//        System.out.println("Horizontal flip done here now vertical starts");
//        //now vertical flip remaining
//
//        for(int []rows:image){
//            for(int j=0;j< rows.length;j++){
//                if(rows[j]==1){
//                    rows[j]=0;
//                }else{
//                    rows[j]=1;
//                }
//            }
//        }
//        System.out.println("Image after vertical flip as well ");
//
//        for (int i=0;i<image.length;i++){
//            for(int j =0;j< image[1].length;j++){
//                System.out.print(image[i][j]+" ");
//            }
//            System.out.print("         ");
//        }
//        System.out.println();
//
//        return image ;
//    }
        public  static int[][] flipAndInvertImage(int[][] A) {
            int C = A[0].length;
            for (int[] row : A) {
                System.out.println(Arrays.toString(row));
                for (int i = 0; i < (C + 1) / 2; ++i) {
                    int tmp = row[i] ^ 1;
                    System.out.println(row[i] + " Xor 1 " + tmp);
                    row[i] = row[C - 1 - i] ^ 1;
                    row[C - 1 - i] = tmp;
                }
            }
                return A;
        }



}
