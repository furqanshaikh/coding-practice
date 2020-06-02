package codility;

import java.util.Arrays;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 * <p>
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int[] A, int K); }
 * <p>
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 * <p>
 * For example, given
 * <p>
 * A = [3, 8, 9, 7, 6]
 * K = 3
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 * <p>
 * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 * [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 * [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * For another example, given
 * <p>
 * A = [0, 0, 0]
 * K = 1
 * the function should return [0, 0, 0]
 * <p>
 * Given
 * <p>
 * A = [1, 2, 3, 4]
 * K = 4
 * the function should return [1, 2, 3, 4]
 * <p>
 * Assume that:
 * <p>
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class CyclicRotation {

    public int[] rotateKwithArrays(int[] A, int K) {

        if (K <= 0) return A;
        if (A.length <= 0) return A;

        K = K % A.length;

        int[] B = Arrays.copyOfRange(A, A.length - K, A.length);
        System.arraycopy(A, 0, A, K, A.length - K);
        System.arraycopy(B, 0, A, 0, B.length);

        return A;
    }

    public int[] rotateK(int[] A, int K) {

        if (K <= 0) return A;
        if (A.length <= 0) return A;

        K = K % A.length;

        for (int i = 0; i < K; i++) {
            int lastIndex = A.length - 1;
            int temp = A[lastIndex];
            for (int j = A.length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int K = 2;
        int[] solutionInts = new CyclicRotation().rotateKwithArrays(new int[]{1, 2, 3, 4}, K);
        System.out.println(Arrays.deepToString(new int[][]{solutionInts}));

        int[] solution = new CyclicRotation().rotateK(new int[]{1, 2, 3, 4}, K);
        System.out.println(Arrays.deepToString(new int[][]{solution}));
    }
}
