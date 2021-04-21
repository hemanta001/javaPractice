package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticCalculation {
    public void divide(){
        Scanner scanner=new Scanner(System.in);
        int numerator;
        int denominator;
        try{
            System.out.println("Enter numerator");
            numerator=scanner.nextInt();
            System.out.println("Enter denominator");
            denominator=scanner.nextInt();
            divideOperation(numerator,denominator,scanner);
        }
        catch (InputMismatchException e){
            divide();
        }

    }

    public void divideOperation(int numerator,int denominator,Scanner scanner){
        try{
            int quotient=numerator/denominator;
            System.out.println("The quotinet is "+quotient);
        }
        catch (ArithmeticException e){
            System.out.println("Enter denominator. Denominator cannot be zero");
            denominator=scanner.nextInt();
            divideOperation(numerator,denominator,scanner);
        }
        finally {
            System.out.println("The operation is performed");
        }
    }

}
