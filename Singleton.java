public class Singleton {
    private static Singleton instance;
    
    // Constructor privat pentru a preveni crearea instanțelor directe
    private Singleton() {
    }
    
    // Metodă publică pentru a obține instanța Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Metode ale instanței
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
    
    public static void main(String[] args) {
        // Obțineți instanța Singleton
        Singleton singleton = Singleton.getInstance();
        
        // Utilizați instanța Singleton
        singleton.doSomething();
    }
}
