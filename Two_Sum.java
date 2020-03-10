import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

1. Two Sum
Add to List
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/
        
public class Two_Sum {

    public static void main(String[] args) {
        int[] input = new int[] {2, 7, 11, 15};
        System.out.println( Arrays.toString(Two_Sum.twoSum(input, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffData = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(diffData.containsKey(nums[i])){
                return new int[] { diffData.get(nums[i]), i};
            }
            if(!diffData.containsKey(nums[i])){
                diffData.put(target - nums[i], i);
            }
        }
        return new int[] {};
        
    }
}
