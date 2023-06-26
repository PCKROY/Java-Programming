public class StringClass {
    public static void main(String[] args) {

//        String s = "Hello Mia";     // 'hello mia' word is being stored in the 's' ref.variable
//        System.out.println(s);
//        System.out.println(s.length());




        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

//        if (s1 == s2){  == equal  or if ( s1 == s3 ) will be not equal '==' checks the obj.
         if(s1.equals(s3)){      //  equals method allows us to compare the contents of the strings rather than the obj. ref.
            System.out.println("equal");
        }else {
            System.out.println("Not equal");
        }


    }
}
