package pl.oskarpolak.demojpa.models;

public class SimpleSingleton {

    private static SimpleSingleton simpleSingleton = new SimpleSingleton();
    public static SimpleSingleton getInstance(){
        return simpleSingleton;
    }
    private int counter;

    private SimpleSingleton(){
        counter = 0;
    }


    public void incrementCounter(){
       counter++;
    }

    public int getCounter(){
        return counter;
    }

    public static void main(String[] args) {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();

        simpleSingleton.incrementCounter();
        simpleSingleton.incrementCounter();
        simpleSingleton.incrementCounter();

        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();

        simpleSingleton1.incrementCounter();
        simpleSingleton1.incrementCounter();

        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();
        System.out.println(simpleSingleton2.getCounter());

    }
}
