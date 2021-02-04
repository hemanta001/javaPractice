package AreaAndPerimeter;

public class Square {

    public void area() {
        int length = 4;
        int area = length ^ 2;
        System.out.println("The area of square is " + area);

    }

    public void perimeter() {
        int length = 4;
        int perimeter = 4*length;
        System.out.println("The perimeter of square is " + perimeter);
    }
}
