public class PSCF02_PiCalculator {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long max = 5000000000L;
        double pi = 0.0;
        double num = 1.0;

        for (long i = 0; i< max; ++i) {
            pi += num / (2 * i + 1);
            num = -num;
            //System.out.println(pi);
        }

        pi *= 4;
        System.out.println("PI = "+pi);

        long d = System.nanoTime() - t0;
        System.out.println("D = " + t0);
    }
}
