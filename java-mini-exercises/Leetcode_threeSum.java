import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//TASK:
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
// that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
//
//
//
//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.

//Example 2:
//
//Input: nums = [0,1,1]
//Output: []
//Explanation: The only possible triplet does not sum up to 0.

//Example 3:
//
//Input: nums = [0,0,0]
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.

public class Leetcode_threeSum {

    //this one has o(n^3) time complexity cz of triple nested loop
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> triplesumList = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++){
           if(i>0 && nums[i] == nums[i-1]){
               continue;
           }

           for(int j= i+1; j<nums.length-1; j++){
               if(j>i+1 && nums[j] == nums[j-1]){
                   continue;
               }

               for(int k=j+1; k<nums.length; k++){
                   if(nums[i] + nums[j] + nums[k] == 0){
                       //add the triplet to tripleSum List if its not a duplicate
                       List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                       if(!triplesumList.contains(triplet)){
                            triplesumList.add(triplet);
                       }
                   }
               }
           }
        }

        return triplesumList;
    }

    public List<List<Integer>> threeeSum(int[] nums){
        //sort the array first
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        //loop through the array from index 0 to nums.length-2
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
        //two pointers to check the remaining elements after nums[i] for potentail
        //triplets
            int startPtr = i+1;
            int endPtr = nums.length-1;

            while(startPtr < endPtr){
                int sum = nums[i] + nums[startPtr] + nums[endPtr];

                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[startPtr], nums[endPtr]));
                    //skip duplicates for startPtr
                    while(startPtr < endPtr && nums[startPtr] == nums[startPtr + 1]){
                        startPtr++;
                    }

                    //skip duplicates for endPtr
                    while(startPtr < endPtr && nums[endPtr]==nums[endPtr-1]){
                        endPtr--;
                    }

                    //move the pointers inward;
                    startPtr++;
                    endPtr--;
                }
                //if sum is less than 0, move the startPtr
                else if(sum < 0){
                    startPtr++;
                }

                else if(sum>0){
                    endPtr--;
                }

            }
        }

        //return the list
        return list;
    }
}
