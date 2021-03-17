package DataAbstractionAndEncapsulation;

public class SecondChildClass implements InterfaceClass,SecondInterfaceClass{
public int printNumber(){

    System.out.println("The number is "+number);
    return number;
}
    @Override
    public void sumOfNumbers() {
        System.out.println("the sum is "+(5+4));
    }

    @Override
    public void subtractNumbers() {
        System.out.println("the difference is "+(5-4));
    }

    @Override
    public void perimeter() {
        System.out.println("The perimter is "+2*(4*3));
    }

    @Override
    public void area() {
        System.out.println("The area is "+4*3);

    }
}
