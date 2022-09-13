public class RAM extends Memory {

    private final int[][] data;

    public RAM(int size) {
        super(size);
        this.data = new int[size][64];
    }


    public int Read(String x) throws InvalidIndex {



        //return this.data[index];
        return 0;
    }

    @Override
    public void Write(int index, int value) throws InvalidIndex {
        VerifyIndex(index);
        //this.data[index] = value;
    }
}
