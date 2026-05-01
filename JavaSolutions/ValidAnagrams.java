package com.learnjavafromalgomaster;

public class ValidAnagrams {
    public static boolean validAnagrams(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        int[] charArray = new int[26];

        for(int i=0;i<s1.length();i++){
            charArray[s1.charAt(i) - 'a']++;
            charArray[s2.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++)
            if(charArray[i]!=0)
                return false;

        return true;
    }
}
