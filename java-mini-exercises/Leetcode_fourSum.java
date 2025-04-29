import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TASK: Given an array nums and an integer target, return all unique quadruplets [a, b, c, d]
//such that a + b + c + d == target.
//Example 1:
//
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//Example 2:
//
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]

//time complexity is o(n^3)
public class Leetcode_fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //Sort the array — like always, to make duplicate checking and two-pointer logic easier.
        //create empty nested arrayLists to store the 4 digit arrays.
        //Use two nested loops (i and j) to fix the first two numbers.
        //
        //For the remaining two numbers, use two pointers (left and right) starting from j + 1 and nums.length - 1.
        //
        //Skip duplicates for i, j, left, and right.
        //
        //Collect results in a list of lists, avoiding duplicate quadruplets.
        Arrays.sort(nums);
        List<List<Integer>> fourSumList = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int startPtr = j + 1;
                int endPtr = nums.length - 1;

                while (startPtr < endPtr) {
                    int sum = nums[i] + nums[j] + nums[startPtr] + nums[endPtr];

                    if (sum == target) {
                        fourSumList.add(Arrays.asList(nums[i], nums[j], nums[startPtr], nums[endPtr]));

                        while (startPtr < endPtr && nums[startPtr] == nums[startPtr + 1]) {
                            startPtr++;
                        }

                        while (startPtr < endPtr && nums[endPtr] == nums[endPtr - 1]) {
                            endPtr--;
                        }

                        startPtr++;
                        endPtr--;
                    } else if (sum < 0) {
                        startPtr++;
                    } else if (sum > 0) {
                        endPtr--;
                    }
                }

            } // j loop finishes

        } // i loop finishes

        return fourSumList;
    }
}