public class Strings {
    public static void main(String[] args) {

        String literalString1 = "Prokash Chandra Roy";
        String literalString2 = "Prokash Chandra Roy";


        String objectString1 = new String("Forhad Reza");
        String objectString2 = new String("Forhad Reza");

        System.out.println(literalString1 == literalString2);

        System.out.println(objectString1 == objectString2);

        // Format Specifier String

        String name = "Prokash Chandra Roy"; //%s
        int age = 25; //%d
        String Country = "Bangladesh"; //%s
        String College = "Chattogram Govt. College"; //%s
        int number = 10; //%d
        double cgpa = 3.25; //%f
        char percentSign = '%'; //%c
        boolean amITellingTheTruth = true; //%b


        String formattedString = String.format("My name is %s.I am %d years old.I live in %s.I do my study in %s." +
                "I have total %d number of friends.I have a cgpa of %f.I have attended almost 80%c of classes that held.These all are %b claims",name,age,Country,College,number,cgpa,percentSign,amITellingTheTruth);

        System.out.println(formattedString);

        String name1 = "Prokash Chandra Roy";

        System.out.println(name1.length());
        System.out.println(name1.isEmpty());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());

        String string = "the sky is blue";
        System.out.println(string.contains("blue")); // for searching a word if the word is present at the string






    }
}
