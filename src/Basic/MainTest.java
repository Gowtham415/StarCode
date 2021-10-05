package Basic;

public class MainTest {
    public static void main(String[] args) {
        SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getInstance();
        System.out.println(singletonDesignPattern.str);
    }
}
