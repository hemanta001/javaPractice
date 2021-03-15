package StaticKeyword;

public class Main {

    public static void main(String[] args) {
//        StaticMethodsAndObjects staticMethodsAndObjects=new StaticMethodsAndObjects();
//        staticMethodsAndObjects.
        StaticMethodsAndObjects.printHello();
        System.out.println("The number is"+ StaticMethodsAndObjects.number);
        StaticMethodsAndObjects.staticMethodsAndObjects.printHelloTwo();
        StaticMethodsAndObjects staticMethodsAndObjects=new StaticMethodsAndObjects();
        staticMethodsAndObjects.printHelloTwo();
    }
}
