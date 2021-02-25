package InheritanceExample;

import java.util.Scanner;

public class Rectangle extends Shapes{

    public void setProperties(){
    setLength();
    setBreadth();
    }

    public void area(){
        System.out.println("The area of rectangle is "+ getLength()*getBreadth());
    }

    public void setLength(){
        System.out.println("Enter length by overriding method");
        Scanner scanner=new Scanner(System.in);
        length=scanner.nextInt();
    }
}
