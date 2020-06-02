package codility.lesson.four;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution_efficient(int N, int[] A) {
        // write your code in Java SE 8

        int[] counters = new int[N];

        int maxValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                counters[A[i] - 1]++;
                maxValue = Math.max(maxValue, counters[A[i] - 1]);
            } else {
                Arrays.fill(counters, maxValue);
            }

        }
        return counters;

    }

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int[] counters = new int[N];

        int maxValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                counters[A[i] - 1]++;
                maxValue = Math.max(maxValue, counters[A[i] - 1]);
            } else {
                Arrays.fill(counters, maxValue);
            }

        }
        return counters;

    }
}
