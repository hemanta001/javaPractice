package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductName {
    BudgetList budgetList;
    List<BudgetList> list = new ArrayList<>();

    public void value() {
        budgetList = new BudgetList();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Name of first item");
            String firstItem = scanner.next();
            System.out.println("Name of Second item");
            String secondItem = scanner.next();
            System.out.println("Name of third item");
            String thirdItem = scanner.next();
            System.out.println("Name of Fourth item");
            String fourthItem = scanner.next();
            System.out.println("Name of fifth item");
            String fifthItem = scanner.next();
            list.add(budgetList);
        System.out.println(list);

        }



    }






