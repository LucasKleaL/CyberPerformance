class InvalidIndex extends Exception {
    public final int ender;
    public InvalidIndex(int e) {
        super();
        ender = e;
    }
    @Override
    public String toString() {
        return "Endereco " + ender + " invalido!";
    }
}

abstract class Memory {
    protected int size;

    public Memory(int size) {
        this.size = size;
    }

    public void VerifyIndex(int index) throws InvalidIndex {
        if (index < 0 || index >= size)
            throw new InvalidIndex(index);
    }

    abstract int Read(int index) throws InvalidIndex;

    abstract void Write(int index, int value) throws InvalidIndex;
}
