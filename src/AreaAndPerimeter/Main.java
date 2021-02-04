package AreaAndPerimeter;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.perimeter(100f,8);//method/function calling
        System.out.println("The area is "+ rectangle.area());
        System.out.println(rectangle.area("Hemanta"));
        Square square=new Square();
        square.area();
        square.perimeter();
    }

}
