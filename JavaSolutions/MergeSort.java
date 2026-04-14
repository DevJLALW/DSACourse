package com.learnjavafromalgomaster;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;

        if(inputLength < 2){
            return;
        }

        int midIndex = inputLength/2;

        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[inputLength-midIndex];

        for(int i = 0; i < inputLength; i++){
            if(i < midIndex){
                leftArray[i] = inputArray[i];
            }
            else
                rightArray[i-midIndex] = inputArray[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(inputArray, leftArray, rightArray);
        System.out.println("Array: " + Arrays.toString(inputArray));
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int leftSize = leftArray.length;
        int rightSize=rightArray.length;

        int l = 0, r = 0, i=0;

        while(l<leftSize && r<rightSize){
            if(leftArray[l] <= rightArray[r]){
                inputArray[i] = leftArray[l];
                l++;
            }
            else {
                inputArray[i] = rightArray[r];
                r++;
            }
            i++;
        }

        while(l< leftSize){
            inputArray[i] = leftArray[l];
            l++;
            i++;
        }
        while(r< rightSize){
            inputArray[i] = rightArray[r];
            r++;
            i++;
        }
    }
}
