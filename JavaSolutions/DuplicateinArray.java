package com.learnjavafromalgomaster;

import java.util.HashSet;
import java.util.Set;

public class DuplicateinArray {

    public static boolean checkDuplicate(int [] inputArray) {
        Set<Integer> collectArray = new HashSet<Integer>();

        for(int num: inputArray){
            if(collectArray.contains(num))
                return true;
            collectArray.add(num);
        }

        return false;

    }


}
