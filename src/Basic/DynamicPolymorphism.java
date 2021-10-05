package Basic;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        FirstClass firstClass = new SecondClass();
        System.out.println("a is :: "+firstClass.a);
        System.out.println("b is :: "+firstClass.b);
        System.out.println(firstClass.multiply());
        firstClass.testMethod();
    }
}

class FirstClass{

    protected int a = 10;
    protected int b = 15;


    protected int multiply(){
        return this.a * this.b;
    }

    protected void testMethod(){
        System.out.println("First Class :: Parent Class");
    }
}

class SecondClass extends FirstClass{

    int a = 18;
    int b=20;

    @Override
    public void testMethod(){
        System.out.println("Second Class :: Child Class");
    }

}
