
public class NeededConversionDataTypes {
    public static void main(String[] args) {

        // Widening casting from byte to int :

        byte b = 10;
        int i = b;

        // Narrowing casting from double to int :

        double d = 3.14;
        int j = (int) d;

        // Convert int to Integer object :

        int q = 10;
        Integer integerObj = Integer.valueOf(i);

        // Convert Integer object to int :

        Integer intObj = 20;
        int w = intObj.intValue();

        // Convert int to String :

        int r = 10;
        String str = Integer.toString(i);

        // Convert String to int :

        String str1 = "20";
        int t = Integer.parseInt(str1);

        // Cast double to int in array :

        double[] doubleArray = {1.1, 2.2, 3.3};
        int[] intArray = new int[doubleArray.length];

        for (int k = 0; k < doubleArray.length; k++) {
            intArray[k] = (int) doubleArray[k];
        }

        // AutoBoxing - int to Integer :

        int y = 10;
        Integer intobj = y;

        Integer intobj1 = 20;
        int u = intobj1;        // Unboxing - Integer to int

        // Convert String to double :
        String str2 = "3.14";
        double D = Double.parseDouble(str2);

        String str3 = "true";
        boolean bool = Boolean.parseBoolean(str3);   // Convert String to boolean

        // Convert String to Integer object :
        String str4 = "42";
        Integer intobj2 = Integer.valueOf(str4);

        // Convert binary to decimal :

        String binaryStr = "101010";
        int decimal = Integer.parseInt(binaryStr, 2);

        // Convert hexadecimal to decimal :

        String hexStr = "FF";
        int hexadecimal = Integer.parseInt(hexStr, 16);

        // int i is promoted to double before addition :

        int i1 = 5;
        double d1 = 2.5;
        double result = i1 + d1;

        // Char to String:

        char c = 'A';
        String Str = Character.toString(c);    // 1st way : //Using the Character.toString() method


        char c1 = 'A';
        String Str1 = "" + c1;   // 2nd way : //Concatenating the char with an empty String


        char c2 = 'A';
        String Str2 = new String(new char[]{c2});   // 3rd way :  //Creating a new String object using the String constructor

        // String to Char:

        String sTr = "Hello";
        char C = str.charAt(0);     // 1st way : //Using the charAt() method to retrieve the first character of the String



        String sTr1 = "Hello";
        char C1 = sTr1.toCharArray()[0];   // 2nd way : // Converting the String to a character array and accessing the first element



        String sTr2 = "Hello";
        char C2 = Character.valueOf(sTr2.charAt(0));    // 3rd way : // Using the Character.valueOf() method



































    }
}