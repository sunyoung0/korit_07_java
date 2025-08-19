package test;

class Factory {
    private static Factory instance;

    private String factoryName;

    private Factory() {
        System.out.println("싱글톤 1");
    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }
}

public class FactoryMain {
    public static void main(String[] args) {
        Factory.getInstance();
        Factory.getInstance();
    }
}