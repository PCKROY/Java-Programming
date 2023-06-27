public class StringClassMethod {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("abc".charAt(1));           //   char method
        System.out.println("abc".length());           //   length method
        System.out.println(str.indexOf("c"));        //   indexof method
        System.out.println(str.contains("abc"));    //   contains method


        String s1 = "AbCxYz";
        String s2 = s1.toLowerCase();   //  to lowercase doesn't modify the given String,just generate new string with containing lowercase char.
        System.out.println(s2);
        System.out.println(s1);
        System.out.println();

        String s3 = s1.toUpperCase();   // to uppercase does the same work as to lowercase but this time everyChar is in Capital form.
        System.out.println(s3);
        System.out.println(s1);

        String ss = "Course Content";
        String sss = ss.replace("Content","essence");

        // replace method is an imp. method to use
        System.out.println(ss);
        System.out.println(sss);


//         SubString Method (very Important method) : Returns a string that is a substring of the given string.
//                The substring begins at the specified BeginIndex and extends to the Char at index
//                EndIndex - 1. Thus the length of the substring is endIndex-BeginIndex.

            String S = "I Love Programming";
            // Start at index = 7 and extract till the end

            String sub = S.substring(7);
            System.out.println(sub);

            // Start at index = 2 and end at index = 6

            String sub1 = S.substring(2,6);
            System.out.println(sub1);


            // String Concatenation :
            // 1. when a string is concatenated with primitive types, they are automatically typecasted to string
            // 2. when a string is concatenated with non-primitive types, the 'toString()' on that obj. is called automatically.

            String STR = "Prokash Chandra";
            String STR1 = " Roy";

            String sTr = STR + STR1 ;           // output = Prokash Chandra Roy

            System.out.println(sTr);























    }
}
