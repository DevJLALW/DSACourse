package com.learnjavafromalgomaster;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(Arrays.toString(productOfArr(arr)));
    }

    public static int[] productOfArr(int[] input){
        int[] result=new int[input.length];
        Arrays.fill(result,1);
        int pre=1;

        for(int i=0;i<input.length;i++){
            result[i] = pre;
            pre= input[i]*pre;
        }
        int postFix = 1;
        for(int i=input.length - 1; i>=0; i--){
            result[i] = postFix * result[i];
            postFix = postFix * input[i];
        }

        return result;
    }
}
