package codility;

public class BinaryGap {

    public String toBinaryString(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }

    public int maxBinaryGap(int N) {

        if (N <= 0)
            return 0;
        String binaryStr = toBinaryString(N);

        int maxGap = 0, currentGap = 0;

        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == '0')
                currentGap++;
            else if (binaryStr.charAt(i) == '1') {
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            }
        }

        return maxGap;

    }
}
