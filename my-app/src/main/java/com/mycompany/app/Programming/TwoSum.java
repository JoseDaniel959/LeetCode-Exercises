package com.mycompany.app.Programming;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int [] array = {2,5,5,11};
        String a = "hola";
        // System.out.print;ln(Arrays.toString(TwoSum.twoSum(array, 10)));
        System.out.println(a.getBytes());
    }   
    
    // This function is O(n Log(n)) complexity
    public static int[] twoSum(int[] nums, int target) {
        int firstUnsortedIndex = 0;
        int secondUnsortedIndex = 0;
        int[] unSortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
         int firstIndex = 0;
         int secondIndex = nums.length - 1;
         int sum = nums[firstIndex] + nums[secondIndex];
         while( sum != target){
            if( sum > target){
                --secondIndex;
                sum =  nums[firstIndex] + nums[secondIndex];
            } 
            else if(sum < target){
                ++firstIndex;
                sum =  nums[firstIndex] + nums[secondIndex];
            } 
            
         }
        
        

        
        for(int i = 0; i<unSortedArray.length;i++){
            if((nums[firstIndex] == unSortedArray[i]) && firstUnsortedIndex == 0){
                firstUnsortedIndex = i;
            }
            else if((nums[secondIndex] == unSortedArray[i]) && secondUnsortedIndex == 0){
                secondUnsortedIndex = i;
            }
         }
       
        int[] result = new int[]{firstUnsortedIndex, secondUnsortedIndex};
        Arrays.sort(result);
        return result;
    }
}
