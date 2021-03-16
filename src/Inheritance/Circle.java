package Inheritance;


/**
 * Created by HEMANT on 13/05/2016.
 */
public class Circle extends Rectangle {
    public void setProperties(){
        setRadius(2.4f);
    }
    public void area(){

        System.out.println("The area of circle is "+Main.pieValue*radius*radius);
    }
    public void perimeter(){
        System.out.println("The perimeter of circle is "+(2*Main.pieValue*radius));
    }

}

