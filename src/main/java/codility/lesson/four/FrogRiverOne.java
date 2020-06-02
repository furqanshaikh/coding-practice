package codility.lesson.four;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        X++;
        boolean[] positions = new boolean[X];
        int sum = (X * (X - 1)) >> 1;
        for (int i = 0; i < A.length; i++) {

            if (!positions[A[i]]) {
                positions[A[i]] = true;
                sum -= A[i];
            }
            if (sum <= 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        new FrogRiverOne().solution(2, new int[] { 1, 1, 1, 1, 1 });

    }

}
