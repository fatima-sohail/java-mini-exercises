package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Task: Given an array of strings strs, group the anagrams together. You can return
//the answer in any order.
//
//Example 1:
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//Explanation:
//There is no string in strs that can be rearranged to form "bat".
//The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
//Example 2:
//Input: strs = [""]
//Output: [[""]]
//
//Example 3:
//Input: strs = ["a"]
//Output: [["a"]]
//
//Constraints:
//strs[i] consists of lowercase English letters.
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        //create a new hashmap that stores string as key and list as value
        //go through each word in the list and sort characters in ascending order
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
