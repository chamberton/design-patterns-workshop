package structural.composite;

public class ItemIdGenerator {
    private static ItemIdGenerator INSTANCE = new ItemIdGenerator();

    private ItemIdGenerator() {}

    public static ItemIdGenerator getInstance() {
        return INSTANCE;
    }

    private long initialItemId = 1;
    
    long getNext() {
        return initialItemId++;
    }
}
