import java.util.HashMap;

public class Leetcode_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return null; //if no pair is found, return null
    }

    public int[] twooSum(int[] nums, int target) {
        //create a hashmap
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            else {
                map.put(nums[i], i); //key and its value: store the number and its index
            }
        }

        return null;
    }
}
