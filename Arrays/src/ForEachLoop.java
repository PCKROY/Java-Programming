public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {100,500,400,600,700};

        int key = 500;

        boolean found  = false;

        // Check whether the given key value is present inside my array

        for( int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }


        if ( found ) {
            System.out.println("Found");
        }
        else  {
            System.out.println("Not Found");

        }









    }
}


