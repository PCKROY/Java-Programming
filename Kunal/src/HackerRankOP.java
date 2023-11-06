import java.util.Scanner;

public class HackerRankOP {
    //function to calculate the meal value
    public static void calculateMeal(double meal_cost, double Tips_Percent, double Tax_Percent){
        System.out.println(Math.round(meal_cost + ((meal_cost / 100) * Tips_Percent) + ((Tax_Percent / 100) * meal_cost )));
    }

    public static void main(String [] args){
        //collect user input
        Scanner scan = new Scanner(System.in);

        double mealCost = scan.nextDouble();
        double tips = scan.nextDouble();
        double tax = scan.nextDouble();

        scan.close();

        calculateMeal(mealCost, tips, tax);

    }
}
