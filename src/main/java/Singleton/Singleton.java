package Singleton;
import java.util.concurrent.ConcurrentHashMap;


public class Singleton {
    static public Singleton singleton = null;
    public ConcurrentHashMap<String, Object> map;
    private Singleton() {
        map = new ConcurrentHashMap<>();
    }
    static public Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            System.out.println("Singleton object has been created");
        } else
            System.out.println("Singleton already in memory");
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.map.put("Yarden", "haha");
        Singleton singleton2 = Singleton.getInstance();
        singleton.map.put("Elad", 100);
        System.out.println(singleton.map);
    }
}
