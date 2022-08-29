public class main {
    public static void main(String[] args) {
        IO io = new IO(System.out);
        Cache cache = new Cache(8);
        CPU cpu = new CPU(cache, io);

        try {
            int start = 0;
            cache.Write(start, 110);
            cache.Write(start+1, 120);

            cpu.Run(start);
        } catch (InvalidIndex e) {
            System.err.println("Erro: " + e);
        }
    }
}
