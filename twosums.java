
import java.util.*;
/*
Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/


class twosums {
	public static void main (String[] args) {
	   int[] nums={3,1,2,3,9};
       int target=10;
       twosum(nums,target);
  /*     int [] output=twosum(nums,target);
       for(int element:output){
        System.out.println(element);
       }*/
    }
    public static void twosum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                System.out.println( map.get(complement));
                System.out.println(i);
            }
            map.put(nums[i],i);
        }
  //      return new int[]{};
        
    }
}