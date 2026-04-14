package com.learnjavafromalgomaster;

import java.util.Arrays;

import static com.learnjavafromalgomaster.BinarySearch.binarySearch;
import static com.learnjavafromalgomaster.DuplicateinArray.checkDuplicate;
import static com.learnjavafromalgomaster.Factorial.factorial;
import static com.learnjavafromalgomaster.Fibonacci.fibonacci;
import static com.learnjavafromalgomaster.LargestSumFixedSlidingWindow.getLargestSum;
import static com.learnjavafromalgomaster.MergeSort.mergeSort;
import static com.learnjavafromalgomaster.MiddleOfLinkedList.getMiddle;
import static com.learnjavafromalgomaster.SlidingWindowContainsDuplicate.containsDuplicateWithinRange;
import static com.learnjavafromalgomaster.TwoSum.twoSum;
import static com.learnjavafromalgomaster.ValidPalindrome.checkPalindrome;

public class Main {

    public static void main(String[] args) {

//        String s1 = "A man, a plan,  canal: Panama";
//        System.out.println(checkPalindrome(s1));



//        int n = 6;
//
//        System.out.println(fibonacci(n));
//
//        for(int i=0;i<=n;i++){
//            System.out.println(fibonacci(i));
//        }





//        int[] result = twoSum(new int[]{2,5,7,9},9);
//        System.out.println(Arrays.toString(result));


//        ListNode head = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(3,
//                                new ListNode(4,
//                                        new ListNode(5,
//                                                new ListNode(6,
//                                                        new ListNode(7)))))));
//
//        int middle = getMiddle(head);
//        System.out.println(middle);

        int[] nums = {1,1,4,15,6,8,3,10,1};
        int k=3;
        System.out.println(containsDuplicateWithinRange(nums,k));
        //System.out.println(checkDuplicate(nums));

 //       System.out.println(factorial(k));
//        System.out.println("Array: " + Arrays.toString(nums));
//        mergeSort(nums);


    }
 }
