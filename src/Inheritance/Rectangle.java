package Inheritance;

/**
 * Created by HEMANT on 13/05/2016.
 */
 public class Rectangle extends Polygon {
    public void setProperties(){
        setLength(3.2f);
        setBreadth(2.6f);
    }
    public void area(){
        System.out.println("The area of rectangle is " +(length*breadth));
    }
    public void perimeter(){
        System.out.println("The perimeter of rectangle is "+(2*(length*breadth)));
    }
}
