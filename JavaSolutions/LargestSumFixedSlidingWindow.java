package com.learnjavafromalgomaster;

public class LargestSumFixedSlidingWindow {

    public static int getLargestSum(int [] arr, int k){
        int windowSum=0;

        for(int i=0;i<k;i++)
            windowSum = windowSum+arr[i];

        int largest=windowSum;

        for(int i=k;i<arr.length;i++) {
            int left = i - k;
            windowSum = windowSum - arr[left];
            windowSum = windowSum + arr[i];
            largest = Math.max(largest,windowSum);
        }

        return largest;
    }
}