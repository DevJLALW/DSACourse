package com.learnjavafromalgomaster;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int [] twoSum( int[] nums, int target ){
        Map<Integer, Integer> numPosition = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int result = target - nums[i];
            if(numPosition.containsKey(result)){
                return new int[]{numPosition.get(result),i};
            }
            numPosition.put(nums[i],i);
        }
        return null;
    }
}