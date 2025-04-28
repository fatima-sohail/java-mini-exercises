import java.util.HashSet;
//TASK: Given an integer array nums, return true if any value appears at least
// twice in the array, and false if every element is distinct.
public class LeetCode_ContainsDuplicate {
    //o(n) time complexity cz:
    //for loop of array: o(n)
    //hashset .contains() & .add(): o(1)
    //bigger value is 0(n)
    public static boolean containsDuplicate(int[] nums) {
        //nums is an array that contains numbers i.e
        //Input: nums = [1, 2, 3, 4]
        //Output: false
        //
        //Input: nums = [1, 2, 3, 1]
        //Output: true

        //create an empty hashset
        HashSet<Integer> seenHashSet = new HashSet<>();

        //go through the array and see if hashset contains num[i],
        //if it does-that means we have found the duplicate-return true
        //else add nums[i] to the hashset
        //return false
        for(int i = 0; i<nums.length; i++){
            if(seenHashSet.contains(nums[i])){
                return true;
            }else{
                seenHashSet.add(nums[i]);
            }
        }

        return false;
    }

    //naive approach-very first appraoch that comes to the mind
    //use nested loop
    public static boolean duplicate(int[] arr){
        for(int i = 0; i<arr.length; i++ ){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums1)); // Output: false
        System.out.println(duplicate(nums1));   // Output: false

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums2)); // Output: true
        System.out.println(duplicate(nums2)); // Output: true
    }
}
