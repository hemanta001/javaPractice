package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstimatedCost {
    BudgetList budgetList;
    List<BudgetList> list = new ArrayList<>();
    int sum=0;
    public void pass(){
        budgetList = new BudgetList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estimated cost");
        int firstItem = scanner.nextInt();
        System.out.println("Estimated cost");
        int secondItem = scanner.nextInt();
        System.out.println("Estimated cost");
        int thirdItem = scanner.nextInt();
        System.out.println("Estimated cost");
        int fourthItem = scanner.nextInt();
        System.out.println("Estimated cost");
        int fifthItem = scanner.nextInt();
        list.add(budgetList);
        sum=fifthItem+secondItem+thirdItem+fourthItem+fifthItem;
        System.out.println("the total money is"+sum);
    }

}
