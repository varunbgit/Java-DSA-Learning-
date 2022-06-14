//package com.varun;
//
////374. Guess Number Higher or Lower
//
///*
//You call a pre-defined API int guess(int num), which returns three possible results:
//
//-1: Your guess is higher than the number I picked (i.e. num > pick).
//1: Your guess is lower than the number I picked (i.e. num < pick).
//0: your guess is equal to the number I picked (i.e. num == pick).
//Return the number that I picked.
// */
//public class GuessTheHIgerLower {
//
//    public static void main(String[] args) {
//
//    }
//
//
//    public static int guessNumber(int n) {
//    int start = 1;
//    int end  = n;
//
//    while(start <= end ){
//        int mid  =  start  + (end-start)/2;
//
//        if(guess( mid) == -1 ) {
//            //our guessed number is higher than picked number
//            end = mid -1;
//        }else if (guess( mid) == 1){
//            //our guessed number is lower than picked number
//
//            start = mid +1;
//        }
//        else {
//            return mid;
//        }
//    }
//    return 0;
//
//    }
//
//
//}
