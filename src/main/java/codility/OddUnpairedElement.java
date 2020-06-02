package codility;

public class OddUnpairedElement {

    public int solution(int[] A) {
        // write your code in Java SE 8

        int nonDuplicate = 0;
        for (int i = 0; i < A.length; i++) {
            nonDuplicate ^= A[i];
        }
        return nonDuplicate;
    }

}
