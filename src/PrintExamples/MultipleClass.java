package PrintExamples;

public class MultipleClass {


    //method or function
    public static void main(String[] args) {

        SubClass subClass = new SubClass();

        subClass.printHello();

        subClass.printWorld();

        SubSubClass subSubClass = new SubSubClass();

        subSubClass.printHello();

        subSubClass.printWorld();


    }

}

class SubClass {

    public void printHello() {

        System.out.println("Hello World");

    }

    public void printWorld(){

        System.out.println("Welcome World");

    }

}

class SubSubClass {

    public void printHello() {

        System.out.println("Sub Hello World");

    }

    public void printWorld(){

        System.out.println("Sub Welcome World");

    }

}

