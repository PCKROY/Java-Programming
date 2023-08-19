package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
            int a = 5;
            int b = 0;
            try {
//                divide ( a , b );                  // throws an exception
                // mimicking
                String name = "Aryan";
                if(name.equals("Aryan")){
                    throw new MyException("Name is Aryan Roy");
                }
            } catch(MyException e){
                System.out.println(e.getMessage());
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            } catch (Exception e ){
                System.out.println("Normal Exception");
            }
              finally {
                System.out.println("This will always execute");         // It does not depend on exception throwing , it can be used only once
            }
    }

    static int divide(int a , int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Please do not divide with zero");        // throw basically means that we are throwing an Exception
        }
        return a / b ;
    }
}
