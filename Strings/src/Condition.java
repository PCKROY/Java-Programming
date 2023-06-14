import jdk.dynalink.Operation;

import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The First Number:");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter The Second Number:");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What Operations Do You Want To Perform? ");
        String Operation = scanner.nextLine();

        switch(Operation) {
            case "sum":
                System.out.printf("%f + %f = %f ", number1, number2 , number1 + number2);
                break;

            case"sub":
                System.out.printf("%f - %f = %f ", number1, number2 , number1 - number2);
                break;

            case"mul":
                System.out.printf("%f * %f = %f ", number1, number2 , number1 * number2);
                break;

            case"div":
                if(number2 == 0) {
                    System.out.printf("Can not divided by zero");}
                else {
                    System.out.printf("%f / %f = %f ", number1, number2 , number1 / number2);}
                break;

            default:
                System.out.printf("%s is not a supported Operation. ", Operation);
        }





       
    }
}

