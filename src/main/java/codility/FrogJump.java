package codility;

public class FrogJump {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        return (int) Math.ceil((double) (Y - X) / D);
    }

}
