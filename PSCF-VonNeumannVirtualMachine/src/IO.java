public class IO {

    private final java.io.PrintStream output;

    public IO (java.io.PrintStream output) {
        this.output = output;
    }
    void Output(String msg) {
        this.output.print(msg);
    }
}
