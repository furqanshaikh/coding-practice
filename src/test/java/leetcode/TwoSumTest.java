package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumCase1() {
        int[] input = {2, 7, 11, 15};
        int[] indicesExpected = {0,1};
        TwoSum twoSumObj = new TwoSum();
        int[] indices = twoSumObj.twoSum(input, 9);
        assertArrayEquals(indicesExpected, indices);
    }

    @Test
    void twoSumCase2() {
        int[] input = {3,2,4};
        int[] indicesExpected = {1,2};
        TwoSum twoSumObj = new TwoSum();
        int[] indices = twoSumObj.twoSum(input, 6);
        assertArrayEquals(indicesExpected, indices);
    }
}
