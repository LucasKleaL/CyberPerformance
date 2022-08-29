public class RAM extends Memory {

    private final int[] data;

    public RAM(int size) {
        super(size);
        this.data = new int[size];
    }

    @Override
    public int Read(int index) throws InvalidIndex {
        VerifyIndex(index);
        return this.data[index];
    }

    @Override
    public void Write(int index, int value) throws InvalidIndex {
        VerifyIndex(index);
        this.data[index] = value;
    }

}
