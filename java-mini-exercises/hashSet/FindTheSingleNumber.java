package hashSet;
//Given a non-empty array of integers nums, every element appears twice except for one.
// Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Example 1:
//Input: nums = [2,2,1]
//Output: 1
//
//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4
//
//Example 3:
//Input: nums = [1]
//Output: 1

import java.util.HashSet;

public class FindTheSingleNumber {
    public int singleNumber(int[] nums){
        //create a hashset
        HashSet <Integer> set = new HashSet<>();
        //go thriugh the whole array and find the number that is mentioned only one time
        for(int num: nums){
            //If the number is not already in the set, we add it.
            if(!set.contains(num)){
                set.add(num);
            } else { //If it is already in the set, we remove it (because it means the number has  appeared twice)
                set.remove(num);
            }
        }

        //used to retreive non repeated element left in the hashset
        //iterator() goes through the hashset, acceses elements one by one, since it doesnt have indices
        //next() returns the next element in the collection, in this case only remaining element
        //in the set
        return set.iterator().next();
    }
}
