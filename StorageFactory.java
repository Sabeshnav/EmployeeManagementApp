package pq6;

public class StorageFactory
{
    private static int arraySize;

    public StorageFactory(int arraySize)
    {
        this.arraySize = arraySize;
        System.out.println(arraySize);
    }

    

    public static Storage getStorage(){
        return new StorageImpl(StorageFactory.arraySize);
    }



    public static int getArraySize() {
        return arraySize;
    }
}
