package com.learnjavafromalgomaster;

public class ValidPalindrome {
    public static boolean checkPalindrome(String palindrome){
        int l =0;
        int r = palindrome.length() - 1;
        while(l<r)
        {
            while( l< r && !Character.isLetterOrDigit(palindrome.charAt(l)) ){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(palindrome.charAt(r)) ){
                r--;
            }

            if(Character.toLowerCase(palindrome.charAt(l)) != Character.toLowerCase(palindrome.charAt(r))){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}


