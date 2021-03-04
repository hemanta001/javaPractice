package Comparision;

import java.util.Scanner;

public class CompareNumbers {

    public void compareNumbers(int a, int b) {

        if (a > b) {
            System.out.println("The greater number is "+a);
            System.out.println("The smaller number is "+b);

        }
        else if(a==b){
            System.out.println("Both numbers are equal ");
        }
        else{
            System.out.println("The greater number is "+b);
            System.out.println("The smaller number is "+a);

        }

    }
    public void compareNumbers(){
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();

        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
    }

}
