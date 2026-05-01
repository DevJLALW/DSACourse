package com.learnjavafromalgomaster;

import java.util.Arrays;

public class DynamicProgrammingBasic {
    public static void main(String[] args) {
        int n=18;
        int[] coins={7,5,1};
        int[] dp = new int[n+1];
        dp[0] =0;
        Arrays.fill(dp,-1);



    }

    public static int minCoins(int n, int[] coins, int[] dp){
        if(n == 0) return 0;

        int ans= Integer.MAX_VALUE;

        for(int i=0;i< coins.length; i++){
            if(n-coins[i] >=0) {

                int subAns = 0;
                if(dp[n - coins[i]] != -1){
                    subAns = dp[n - coins[i]];
                }
                else  subAns = minCoins(n - coins[i], coins, dp);

                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }

        }
        return dp[n] = ans;
    }
}
