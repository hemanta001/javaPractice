package InheritanceExample;

import java.util.Scanner;

public class Shapes {
    protected int length;
    protected int breadth;

    public void setLength(){
        System.out.println("Enter length");
        Scanner scanner=new Scanner(System.in);
        length=scanner.nextInt();
    }
    public void setBreadth(){
        System.out.println("Enter breadth");
        Scanner scanner=new Scanner(System.in);
        breadth=scanner.nextInt();
    }

    public int getBreadth(){
        return breadth;
    }

    public int getLength(){
        return length;
    }
}
