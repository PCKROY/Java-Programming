public class StringVsCharArr {
    public static void main(String[] args) {

        // Both String and CharArrays allows us to store and handle
        // sequences of Characters. But they are different in some properties.

        String str = "Hello";
        char[] arr = {'H','e','l','l','o'};
        System.out.println(str);
        System.out.println(arr);

        char[] arr1 = str.toCharArray();       // String to charArr[] Changing
        System.out.println(arr1);

        String str1 = new String(arr);       //  charArr[] to String Changing
        System.out.println(str1);


    }
}
