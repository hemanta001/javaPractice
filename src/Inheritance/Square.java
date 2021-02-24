package Inheritance;

/**
 * Created by HEMANT on 13/05/2016.
 */
public class Square extends Rectangle {
    public void setProperties(){
        setLength(2.16f);
    }
    public void area(){
        System.out.println("The area of square is "+(length*length));
    }
    public void perimeter(){
        System.out.println("The perimeter of square is "+(4*length));
    }
}
