public class ReturnTypes {
    static int square(int num){
        return (num * num);     // return statement
    }
    static void hello(){
        System.out.println("Hello Bangladesh");
    }
    static String[] dishes(){
        String[] foods = {"Rice","Vegetables","Meat","Fish","Egg"};
        return foods;
    }
    public static void main(String[] args) {
        System.out.println(square(100));
        System.out.println(square(5));
        hello();

        String[] arr = dishes();
        for(String food : arr){
            System.out.println(food);
        }




    }
}
