package Project;

import ArrayList.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FinalWork {
    List<BudgetList> list = new ArrayList<>();
    BudgetList budgetList;


    public void setBudgetList() {
        budgetList = new BudgetList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your total expenses");
        int salary = scanner.nextInt();
        System.out.println("how many items you want to buy");
        String[] string = new String[scanner.nextInt()];
        for (String str : string) {
            ProductName productName = new ProductName();
            productName.value();
            EstimatedCost estimatedCost = new EstimatedCost();
            estimatedCost.pass();
            MarketCost marketCost = new MarketCost();
            marketCost.money();
        }


    }

    public void getBudgetList() {
        for (BudgetList budgetList : list) {
            System.out.println(budgetList.getProductName());
            System.out.println(budgetList.getEstimatedCost());
            System.out.println(budgetList.getMarketCost());
        }
    }
}












