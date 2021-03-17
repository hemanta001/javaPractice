package DataAbstractionAndEncapsulation;

public class Main {

    public static void main(String[] args) {
        AbstractClass abstractClass=new ChildClass();
        abstractClass.area();
        abstractClass.perimeter();
        System.out.println("The number is "+abstractClass.getNumber());
        InterfaceClass interfaceClass=new SecondChildClass();
        interfaceClass.subtractNumbers();
        interfaceClass.sumOfNumbers();
        SecondChildClass secondChildClass=new SecondChildClass();
        System.out.println("The number is "+secondChildClass.printNumber());
        SecondInterfaceClass secondInterfaceClass=new SecondChildClass();
        secondInterfaceClass.area();
        secondInterfaceClass.perimeter();

    }

}
