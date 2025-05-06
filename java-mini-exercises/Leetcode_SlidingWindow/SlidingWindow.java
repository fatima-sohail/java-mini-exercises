package Leetcode_SlidingWindow;
//moving average
//Given a stream of integers and a window size, calculate the moving average of all
// integers in the sliding window.
//
//Implement the MovingAverage class:
//
//MovingAverage(int size) Initializes the object with the size of the window size.
//double next(int val) Returns the moving average of the last size values of the stream.
//
//
//Example 1:
//Input
//["MovingAverage", "next", "next", "next", "next"]
//[[3], [1], [10], [3], [5]]
//Output
//[null, 1.0, 5.5, 4.66667, 6.0]
//
//Explanation
//MovingAverage movingAverage = new MovingAverage(3);
//movingAverage.next(1); // return 1.0 = 1 / 1
//movingAverage.next(10); // return 5.5 = (1 + 10) / 2
//movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
//movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3


import java.util.LinkedList;
import java.util.Queue;

//intuition
//q.size(3)
//q[1] [1 10 3] [10 3 5]
//sum = 1 + 10 + 3  | 1 - 10 + 3 + 5
//average= sum/q.size()
public class SlidingWindow {
    int size; //max size of sliding window
    Queue<Integer> q;   //to store elements in the window
    double sum; //running sum of elements in window

    public SlidingWindow(int size){
        this.size = size;   //set the window size
        q = new LinkedList<>(); //linkedList allows o(1) time complexity in removing head, and inserting new value at the tail
        this.sum = 0;
    }

    public double next(int val){
        //check if the q is full(window is at maxsize)
        //if its full, remove head val from the sum using q.poll()
        if(q.size() == size){
            sum = sum - q.poll();
        }
        //once an item is removed, there is space for a new val to be added
        //add the new val to this sum
        sum = sum + val;
        //add new val into q
        q.add(val);
        //return the average
        return sum/q.size();
    }
}
