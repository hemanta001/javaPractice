package Polymorphism.RuntimePolyMorphismOrMethodOverriding;

class Splendor extends Bike{
    protected void executeMethod(){
        run();
    }

    protected void run(){
        System.out.println("running safely with 60km");
    }
}
