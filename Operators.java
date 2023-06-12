


public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operator;

        double number1 = 20;
        int number2 = 16;
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 + number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);


        //Assignment Operator;

        int number = 20;

        number *= 5;

        System.out.println(number);


        // Relational Operator;
        int number3 = 17;
        int number4 = 13;

        // is equal to
        System.out.println(number3 == number4);

        // is not equal to
        System.out.println(number3 != number4);

        //is greater than
        System.out.println(number3 > number4);

        //is less than
        System.out.println(number3 < number4);

        //is greater than or equal to
        System.out.println(number3 >= number4);

        //is less than or equal to
        System.out.println(number3 <= number4);


        // Logical "& ||" operator;
        int age = 40;

        System.out.println(age >= 20 && age <= 40);

        // when asked can a student enter the library if the following conditions are applied? the answer is YES.

        boolean isStudent = true;
        boolean isLibraryMember = false;

        System.out.println(isStudent || isLibraryMember);


        int number5 = 55;
        System.out.println(++number5);










    }
}

