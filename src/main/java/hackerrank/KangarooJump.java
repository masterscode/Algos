package hackerrank;

public class KangarooJump {
    public static void main(String[] args) {
        System.out.println(0);
    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        return  (x2 - x1) * (v2 - v1) < 0 && (x2 - x1) % (v2 - v1) == 0 ? "YES" : "NO";
    }
}
