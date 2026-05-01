package com.learnjavafromalgomaster;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] str){
        if(str.length==0) return new ArrayList<>();

        Map<String, List> map = new HashMap<>();

        int[] charArr = new int[26];

        for(String s:str) {
            Arrays.fill(charArr,0);
            for(char c:s.toCharArray()) {
                charArr[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");

            for (int i=0;i<26;i++) {
                sb.append("#");
                sb.append(charArr[i]);
            }
            String key = sb.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }
        return  new ArrayList(map.values());
    }
}
