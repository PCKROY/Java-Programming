package StaticExample;

// This is a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    // Will only run once , when the first object is created i.e. when the class is loaded for the first time
    static{
        System.out.println("I am in the static block");
        b = a * 4;
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 4;

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
