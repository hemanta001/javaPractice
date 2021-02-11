package ArgumentsFunction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int length = scanner.nextInt();
        System.out.println("Enter breadth of rectangle");
        int breadth = scanner.nextInt();
        Rectangle rectangle = new Rectangle();
        rectangle.area(length,breadth);
        rectangle.perimeter(length,breadth);
    }
}


