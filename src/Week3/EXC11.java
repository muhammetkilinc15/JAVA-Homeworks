package Week3;
public class EXC11 {
    public static void main(String[] args) {
        double e = 1;
        for (int i = 1; i < 50; i++) {
            e += 1.0 / factoriel(i);
        }
        System.out.println("Approximate value of e: " + e);
    }

    private static long factoriel(long a) {
        if (a == 1) {
            return 1;
        }
        return a * factoriel(a - 1);
    }
}
