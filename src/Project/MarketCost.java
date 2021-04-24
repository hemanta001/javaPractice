package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketCost extends BudgetList{
    BudgetList budgetList;
    List<BudgetList> list = new ArrayList<>();
    int sum2=0;
    public void money(){
        budgetList = new BudgetList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Market cost");
        int firstItem = scanner.nextInt();
        System.out.println("Market cost");
        int secondItem = scanner.nextInt();
        System.out.println("Market cost");
        int thirdItem = scanner.nextInt();
        System.out.println("Market cost");
        int fourthItem = scanner.nextInt();
        System.out.println("Market cost");
        int fifthItem = scanner.nextInt();
        list.add(budgetList);
        sum2=fifthItem+secondItem+thirdItem+fourthItem+fifthItem;
        System.out.println("the total money is"+sum2);
    }

}
