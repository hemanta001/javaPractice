package Inheritance;



public class Main {
    static final float pieValue=3.14f;

    public static void main(String args[]){
     Rectangle r=new Rectangle();
        r.setProperties();
        r.area();
        r.perimeter();
        Square sq=new Square();
        sq.setProperties();
        sq.area();
        sq.perimeter();
        Circle c=new Circle();
        c.setProperties();
        c.area();
        c.perimeter();

    }
}
