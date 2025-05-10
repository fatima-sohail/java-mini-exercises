
Example 1:

3 → 2 → 0 → -4
    ↑        ↓
     ←───────

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, 
             where the tail connects to the 1st node (0-indexed).

Example 2:

1 ----> 2
↑       ↓
  ←───

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, 
             where the tail connects to the 0th node.

Example 3:
+------+
|      |
v      |
[1] ----> null
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

------------------------------------------------
Remove Nth leetcode_BinarySearchTree.Node From The End

Input: head = [1,2,3,4,5], n = 2 i.e remove node at position 2 from tail
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1 i.e i.e remove node at position 1 from tail
Output: []

Example 3:
Input: head = [1,2], n = 1 i.e remove node at position 1 from tail
Output: [1]