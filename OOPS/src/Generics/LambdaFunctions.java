package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 2);
        }
//        arr.forEach((item) -> {
//            System.out.println(item * 2);
//        });

        Consumer<Integer> fun = (item) ->
                System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a , b ) -> a + b;
        Operation product = (a , b) -> a * b;
        Operation substract = (a , b) -> a - b;

        LambdaFunctions calculator = new LambdaFunctions();
        System.out.println(calculator.operate(6, 3, sum));
        System.out.println(calculator.operate(6, 3, product));
        System.out.println(calculator.operate(6, 3, substract));
    }
    private int operate (int a , int b , Operation op){
        return op.operation(a,b);
    }

}
interface Operation {
    int operation ( int a, int b);
}

