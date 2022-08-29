public class PSCF01_JavaNanoTime {
     public static void main(String[] args) {
        int counter = 0;
        long t0 = System.nanoTime();

        /*
        for (int i = 0; i < 5000000; ++i) {
            System.out.print("x");
        }
        */

        while (counter < 5000000) {
            System.out.print("x");
            counter++;
        }

        long d = System.nanoTime() - t0;
        System.out.println("D = " + d/1e9 + "s");
    }
}
