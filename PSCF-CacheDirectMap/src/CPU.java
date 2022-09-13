public class CPU {
    private int pc = 0;
    private int regA = 0;
    private int regB = 0;
    private int regC = 0;
    private Cache cache;
    private IO io;

    public CPU(Cache cache, IO io) {
        this.cache = cache;
        this.io = io;
    }

    public void Run(int index) throws InvalidIndex {
        this.pc = index;

        // read program from memory
        regA = this.cache.Read(pc++);
        regB = this.cache.Read(pc++);

        // counter
        regC = 1;

        while (regA <= regB) {
            cache.Write(regA, regC);
            io.Output("> " + regA + " -> " + regC + "\n");
            ++regC;
            ++regA;
        }

    }
}
