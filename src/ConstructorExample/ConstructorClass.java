package ConstructorExample;

public class ConstructorClass {
int length;//declaration
int breadth;//declaration
    //default constructor
    public ConstructorClass(){
        System.out.println("I am at no argument constructor class");
        length=10;//initialization
        breadth=5;
        System.out.println("The area is "+(length*breadth));
    }
    public ConstructorClass(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
