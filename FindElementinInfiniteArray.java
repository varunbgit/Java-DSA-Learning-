package com.varun;

public class FindElementinInfiniteArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23,30,32,33,35,37,38,40};
        int target = 15;
        System.out.println("Found at index " + Search(arr,target));
    }

    public static int Search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            if (target > arr[end]) {

                start = end+1;
                end = 2 * start;
                continue;

            }
        }


        while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else if (target > arr[mid])
                        start = mid + 1;
                    else {
                        return mid;
                    }
                }
                return -1;




    }

}