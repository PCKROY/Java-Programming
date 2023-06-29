import java.util.Scanner;
public class Main {
    public static void tea(){
        System.out.println("Boil water with tea leaves and sugar");
        System.out.println("add milk (optional) and boil for a few minutes");
        System.out.println("serve the tea in a cup");
    }
    public static void coffee(){
        System.out.println("Boil some milk");
        System.out.println("Put some black coffee in the cup");
        System.out.println("Pour the milk into the cup");
    }
    public static void main(String[] args) {


        // Making the tea recipe :
        System.out.println("tea recipe :");
        tea();
        System.out.println();

        // Making the coffee recipe :
        System.out.println("coffee recipe :");
        coffee();


    }
}