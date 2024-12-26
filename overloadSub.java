public class overloadSub {
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int subtract(int x, int y, int z) {
        return x - y - z;
    }
    public static float subtract(float x, float y) {
        return x - y;
    }
    public static long subtract(long x, long y) {
        return x - y;
    }
    public static short subtract(short x, short y) {
        return (short)(x - y);
    }
    public static double subtract(double x, double y) {
        return x - y;
    }
}
