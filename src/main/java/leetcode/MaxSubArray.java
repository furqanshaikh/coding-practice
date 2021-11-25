package leetcode;

import java.util.Objects;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */

class Tuple {
    int start_index;
    int end_index;
    int max_sum;

    public Tuple(int start_index, int end_index, int max_sum) {
        this.start_index = start_index;
        this.end_index = end_index;
        this.max_sum = max_sum;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "start_index=" + start_index +
                ", end_index=" + end_index +
                ", max_sum=" + max_sum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return start_index == tuple.start_index && end_index == tuple.end_index && max_sum == tuple.max_sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start_index, end_index, max_sum);
    }
}

public class MaxSubArray {

    public Tuple maxSubArray(int[] nums) {
        Tuple tuple = new Tuple(0, 0, Integer.MIN_VALUE);
        int max_ending_here = 0;
        int probable_start_index = 0;


        for (int i = 0; i < nums.length; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (tuple.max_sum < max_ending_here) {
                tuple.max_sum = max_ending_here;
                tuple.start_index = probable_start_index;
                tuple.end_index = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                probable_start_index = i + 1;
            }
        }
        return tuple;
    }
}
