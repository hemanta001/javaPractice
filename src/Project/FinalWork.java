package Project;

import ArrayList.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FinalWork {
    List<BudgetList> list = new ArrayList<>();
    BudgetList budgetList;
    int difference=0;
    int taxiFare=0;


    public void setBudgetList() {
        budgetList = new BudgetList();
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your total expenses");
            int salary = scanner.nextInt();

        String confirmation;
        System.out.print("Are you going to shop?");
        Scanner scanner1 = new Scanner(System.in);
        confirmation = scanner.next();
        if (confirmation.equals("yes")){
            System.out.println("enjoy your shopping");
        }
        else if (confirmation.equals("no")){
            return;

        }
        else{
            System.out.println("the value must be yes or no");
        }
        System.out.print("Are you going by taxi ?");
        Scanner n = new Scanner(System.in);
        confirmation = scanner.next();
        if (confirmation.equals("yes")){
            System.out.println("cost of taxi fare");
            taxiFare=scanner.nextInt();
            System.out.println("the taxi fare is" +taxiFare);
        }


            ProductName productName = new ProductName();
            productName.value();
            EstimatedCost estimatedCost = new EstimatedCost();
            estimatedCost.pass();
            MarketCost marketCost = new MarketCost();
            marketCost.money();
            difference= marketCost.sum2-estimatedCost.sum;
        System.out.println("the total money after deducting estimated amount and market price is" +(difference+taxiFare));

            if (salary > difference) {
               System.out.println(salary);
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












