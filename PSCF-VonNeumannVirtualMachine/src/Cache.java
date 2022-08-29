public class Cache extends Memory {

    private int[] data;
    private int ramIndex = -1;
    private RAM ram;

    public Cache(int size) {
        super(size);
        this.data = new int[size];
        this.ram = new RAM(128);
    }

    @Override
    int Read(int index) throws InvalidIndex {
        System.out.println("cache read "+index);
        if (this.IsInCache(index)) {
            System.out.println("cache data "+this.data[index]);
            return this.data[index];
        }
        else {
            this.ReadFromRam(index);
            return this.ram.Read(index);
        }
    }

    @Override
    void Write(int index, int value) throws InvalidIndex {
        System.out.println("write on index "+index);
        if (index <= 7) {
            this.data[index] = value;
        }
        this.ram.Write(index, value);
    }

    void ReadFromRam(int index) throws InvalidIndex {
        for (int i = 0; i < this.data.length; i++) {
            this.Write(i, this.ram.Read(index));
            this.ramIndex = index;
            index++;
        }
        System.out.println("ram block "+this.data);
    }

    boolean IsInCache(int index) throws InvalidIndex {
        boolean inCache = false;
        if (index == this.ramIndex || index < (this.ramIndex + 7)) {
            inCache = true;
        }
        System.out.println("inCache "+inCache);
        return inCache;
    }
}