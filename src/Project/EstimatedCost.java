package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstimatedCost {
    BudgetList budgetList;
    List<BudgetList> list = new ArrayList<>();
    public void pass(){
        budgetList = new BudgetList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estimated cost");
        String firstItem = scanner.next();
        System.out.println("Estimated cost");
        String secondItem = scanner.next();
        System.out.println("Estimated cost");
        String thirdItem = scanner.next();
        System.out.println("Estimated cost");
        String fourthItem = scanner.next();
        System.out.println("Estimated cost");
        String fifthItem = scanner.next();
        list.add(budgetList);
        System.out.println(list);
    }

}
