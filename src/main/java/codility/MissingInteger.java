package codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min)
                continue;
            if (A[i] == min)
                min++;
            else
                break;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] { -1, -3 };
        int solution = new MissingInteger().solution(array);
        System.out.println(solution);
    }
}
