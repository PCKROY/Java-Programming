public class Parameters {
    public static void main(String[] args) {
        String name = "Bruce Wayne";
        int age = 36;
        String[] hobbies = {"Fighting against the maniacs"};
        introduce(name, age, hobbies);

    }

    public static void introduce(String name, int age, String[] hobbies) {
        System.out.println("Batman's real name is " + name);
        System.out.println("He is " + age + " years old");
        System.out.println("His hobbies is ");
        for (String hobby : hobbies) {
            System.out.println("- " + hobby);
        }
    }
}
