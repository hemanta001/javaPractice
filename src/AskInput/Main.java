package AskInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int length = scanner.nextInt();
        System.out.println("Enter breadth of rectangle");
        int breadth = scanner.nextInt();
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimter of rectangle is "+perimeter);
    }
}
