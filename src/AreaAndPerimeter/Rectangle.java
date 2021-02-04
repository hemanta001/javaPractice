package AreaAndPerimeter;

public class Rectangle {

    public float area() {//return type method/function with zero arguments
        float length = 5.25f;
        int breadth = 2;
        return length*breadth;
    }

    public void perimeter(float length,int breadth) {//void type method with two arguments
        float perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of rectangle is " + perimeter);

    }
    public String area(String fullName){//return type method with one arguments

        return fullName;
    }

}
