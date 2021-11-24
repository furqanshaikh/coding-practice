package codility.challenge.palladium2020;

import java.util.Arrays;

public class Main {

    public int solution(int[] H) {
        int min = Arrays.stream(H).max().getAsInt() * H.length;

        for (int i = 1; i < H.length; i++) {
            int[] leftArray = Arrays.copyOfRange(H, 0, i);
            int[] rightArray = Arrays.copyOfRange(H, i, H.length);

            int val = (Arrays.stream(leftArray).max().getAsInt() * leftArray.length)
                    + (Arrays.stream(rightArray).max().getAsInt() * rightArray.length);
            min = Math.min(min, val);
        }
        return min;
    }

    public int solution_back(int[] H) {

        if (H.length <= 0)
            return 0;
        int i = 0;
        int j = H.length - 1;
        int maxLeft = H[i];
        int maxRight = H[j];
        int max = H[i];
        int maxIndex = 0;
        while (i <= j) {
            if (H[i] <= H[j]) {
                if (H[i] >= max) {
                    if (i != j)
                        maxLeft = Math.max(maxLeft, H[i]);
                    max = H[i];
                    maxIndex = i;
                }
                i++;
            } else {
                maxRight = Math.max(maxRight, H[j]);
                if (H[j] > max) {
                    max = H[j];
                    maxIndex = j;
                }
                j--;
            }
        }

        int T1 = (maxIndex * maxLeft) + (max * (H.length - maxIndex));
        int T2 = ((maxIndex + 1) * max) + (maxRight * (H.length - maxIndex - 1));

        return Math.min(T1, T2);

    }
}
