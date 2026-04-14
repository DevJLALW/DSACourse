package com.learnjavafromalgomaster;

import java.math.BigInteger;

public class Factorial {

//    public static  long factorial(int num){
//
//
//        long result = 1;
//        for(int i=2;i<=num;i++) result *=i;
//        return  result;
//
//
//    }

    public static BigInteger factorial(int n){
        BigInteger res=new BigInteger("1");
        for(int i=2;i<=n;i++)
            res=res.multiply(BigInteger.valueOf(i));
        return res;
    }
}
