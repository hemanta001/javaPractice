package ArrayExamples;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int salary[]=new int[7];
        for( int i=0;i<salary.length;i++){
            System.out.println("Enter salary "+(i+1));
            salary[i] = scanner.nextInt();
        }
    }
}
