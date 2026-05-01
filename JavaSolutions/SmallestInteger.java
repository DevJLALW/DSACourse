package com.learnjavafromalgomaster;

import java.util.HashSet;
import java.util.Set;

public class SmallestInteger {
    public static int getSmallestInt(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int num: arr){
            set.add(num);
        }
        for(int i=1;i<=arr.length+1;i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}

/*
* class Solution {
    public int solution(int[] A) {
        int n = A.length;

        int i = 0;
        while (i < n) {
            int current = A[i];

            if (current >= 1 && current <= n && A[current - 1] != current) {
                // swap A[i] with A[current - 1]
                int temp = A[current - 1];
                A[current - 1] = A[i];
                A[i] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
* */