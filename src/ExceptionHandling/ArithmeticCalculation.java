package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticCalculation {

    public void divide(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numerator");
        int numerator=scanner.nextInt();
        System.out.println("Enter denominator");
        int denominator=scanner.nextInt();
        divideOperation(numerator,denominator,scanner);
    }

    public void divideOperation(int numerator,int denominator,Scanner scanner){
        try{
            int quotient=numerator/denominator;
            System.out.println("The quotinet is "+quotient);
        }
        catch (Exception e){
            System.out.println("Enter denominator. Denominator cannot be zero");
            denominator=scanner.nextInt();
            divideOperation(numerator,denominator,scanner);
        }
        finally {
            System.out.println("The operation is performed");
        }
    }
}
