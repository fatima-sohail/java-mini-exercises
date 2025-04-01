package hashSet;

import java.util.HashSet;

public class FindIntersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        //create a hash set to store nums1 array
        //store all the nums1 array in hashset using for loop
        //check for common elements in nums2 array
        //store the result in result hashSet
        //convert the result hashset into array

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for(int num1: nums1){
            set1.add(num1);
        }

        //check for the common elements in nums2
        for(int num2: nums2){
            if(set1.contains(num2)){
                resultSet.add(num2);
            }
        }

        // Convert the result set to an array
        int[] resultArray = new int[resultSet.size()]; //as big as reultSet size, no more space needed
        int index = 0;
        for(int num: resultSet){
            resultArray[index] = num;
            index++;
        }

        return resultArray;
    }
}
