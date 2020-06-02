package codility.challenge.palladium2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();
        assertEquals(10, main.solution(new int[] { 3, 1, 4 }));
    }

    @Test
    void testCase2() {
        Main main = new Main();
        assertEquals(17, main.solution(new int[] { 5, 3, 2, 4 }));
    }

    @Test
    void testCase3() {
        Main main = new Main();
        assertEquals(19, main.solution(new int[] { 5, 3, 5, 2, 1 }));
    }

    @Test
    void testCase4() {
        Main main = new Main();
        assertEquals(35, main.solution(new int[] { 7, 7, 3, 7, 7 }));
    }

    @Test
    void testCase5() {
        Main main = new Main();
        assertEquals(30, main.solution(new int[] { 1, 1, 7, 6, 6, 6 }));
    }

    @Test
    void testCase6() {
        Main main = new Main();
        assertEquals(28, main.solution(new int[] { 4, 4, 10, 10 }));
    }

}
