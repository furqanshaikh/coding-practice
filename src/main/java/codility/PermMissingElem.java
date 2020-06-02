package codility;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        double d = ((A.length + 2) * (A.length + 2 - 1)) >> 1;
        return (int) (d - sum);
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[] { 2, 3, 1, 5 }));
    }
}
