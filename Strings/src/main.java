public class main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I love coding");      // StringBuilder to String ( constructor of string builder )

        sb.append(" and chips");

        sb.insert(13 , ", gaming");

        sb.replace(7,13 ,"java");

        sb.replace(2,6,"Loving");

        sb.delete(0,1);

        sb.delete(12,30);

        System.out.println(sb);          // output will be "Loving java"

        String str = sb.toString();     // String to StringBuilder
        System.out.println(str);       // datatype has been changed to String


    }
}
