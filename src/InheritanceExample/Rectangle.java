package InheritanceExample;

public class Rectangle extends Shapes{

    public void setProperties(){
    setLength();
    setBreadth();
    }

    public void area(){
        System.out.println("The area of rectangle is "+ getLength()*getBreadth());
    }
}
