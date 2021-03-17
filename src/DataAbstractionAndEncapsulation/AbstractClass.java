package DataAbstractionAndEncapsulation;

public abstract class AbstractClass {
    private int number = 10;

    public void area() {

        System.out.println("The area is " + 4 * 3);

    }

    public int getNumber() {
        return number;
    }

    public abstract void printHello();

    public abstract void perimeter();//method declare
}
