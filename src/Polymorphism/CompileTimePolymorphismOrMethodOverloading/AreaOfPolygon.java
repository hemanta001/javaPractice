package Polymorphism.CompileTimePolymorphismOrMethodOverloading;

public class AreaOfPolygon {

    public void area(int length){
        System.out.println("the area of square is "+length*length);
    }
    public void area(int length,int breadth){
        System.out.println("the area of square is "+length*breadth);
    }

    public void area(float radius){
        System.out.println("The area of circle is "+(22/7)*radius*radius);
    }

}
