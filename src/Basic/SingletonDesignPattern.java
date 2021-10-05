package Basic;

public class SingletonDesignPattern {

    public final String str= "TestSingleton";

    private static SingletonDesignPattern singletonDesignPattern = null;

    private SingletonDesignPattern(){

    }

    public static SingletonDesignPattern getInstance(){
        if (singletonDesignPattern == null) {
            synchronized (SingletonDesignPattern.class) {
                if (singletonDesignPattern == null) {
                    return new SingletonDesignPattern();
                }
            }
        }
        return null;
    }
}
