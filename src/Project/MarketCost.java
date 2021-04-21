package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketCost extends BudgetList{
    BudgetList budgetList;
    List<BudgetList> list = new ArrayList<>();
    public void money(){
        budgetList = new BudgetList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Market cost");
        String firstItem = scanner.next();
        System.out.println("Market cost");
        String secondItem = scanner.next();
        System.out.println("Market cost");
        String thirdItem = scanner.next();
        System.out.println("Market cost");
        String fourthItem = scanner.next();
        System.out.println("Market cost");
        String fifthItem = scanner.next();
        list.add(budgetList);
        System.out.println(list);
    }
}
