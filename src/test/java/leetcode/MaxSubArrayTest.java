package leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {
    private static MaxSubArray maxSubArray;

    @BeforeAll
    static void beforeAll() {
        maxSubArray = new MaxSubArray();
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void maxSubArrayCase1() {
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(maxSubArray.maxSubArray(a), new Tuple(3,6,6));
    }

    @Test
    void maxSubArrayCase2() {
        int [] a = {1};
        assertEquals(maxSubArray.maxSubArray(a), new Tuple(0,0,1));
    }

    @Test
    void maxSubArrayCase3() {
        int [] a = {5,4,-1,7,8};
        assertEquals(maxSubArray.maxSubArray(a), new Tuple(0,4,23));
    }

    @Test
    void maxSubArrayCase4() {
        int [] a = {-23, -11, -3, -44};
        assertEquals(maxSubArray.maxSubArray(a), new Tuple(2,2,-3));
    }
}
