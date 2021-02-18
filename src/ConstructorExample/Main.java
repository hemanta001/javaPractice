package ConstructorExample;

public class Main {
    public static void main(String[] args) {
        ConstructorClass constructorClass = new ConstructorClass();
        ConstructorClass constructorClass1 = new ConstructorClass(10,6);
        System.out.println("The area is "+constructorClass.area());
        System.out.println("The perimeter is "+constructorClass.perimeter());
    }
}
