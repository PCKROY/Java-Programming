package oops.introduction;
// Hence, all class objects in java must be allocated dynamically
import java.util.Arrays;

public class oopsPart1 {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        //  data of 5 students : {roll no , names , marks }
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];    // collective data

        // just declaring

//        Student Aryan;
//        System.out.println(Arrays.toString(students));    // [ null, null , ..... ]

        Student Aryan = new Student(10 ,"Prokash Chandra Roy" , 85.5f);    // here Student() is a by default constructor
        Student Rahul = new Student(12 , "Rahul Mehta",84f);
        // fixing a value to Aryan ref.variable
//        Aryan.rno = 10;
//        Aryan.name = "Prokash Chandra Roy";
//        Aryan.marks = 84.5f;        // if a default value is given in class,then java will pick that value of class.

//        Aryan.changeName("Code lover");
//        Aryan.greeting();

        Student random = new Student();



        System.out.println(Aryan.rno);
        System.out.println(Aryan.name);
        System.out.println(Aryan.marks);
        System.out.println();
        System.out.println(Rahul.rno);
        System.out.println(Rahul.name);
        System.out.println(Rahul.marks);

        Student random1 = new Student();

//        System.out.println(random.name);      // student(other method)
    }


}

// create a class
// for every single student

class Student {
    int rno;
    String name;
    float marks;
// we need a way to add the values of the above
// properties object by object
// we need one word to access every object
   void greeting() {
       System.out.println("Hello! My name is " + this.name); // This means , whenever u try to access
       // any particular item of the class via its object,
       // obviously every single item will be specified to that object
    }
    void changeName(String newName){
       this.name = newName;
    }

//    Student(Student other) {
//       this.rno = other.rno;
//       this.name = other.name;
//       this.marks = other.marks;
//    }

    Student() {
       // This is how you call a constructor from another constructor
        // Internally : new Student(10,"Prokash Chandra Roy",85.5f)
        this(10,"Prokash Chandra Roy",85.5f);

//        this.rno = 10;
//        this.name = "Prokash Chandra Roy";
//        this.marks = 85.5f;
    }
    // Student Aryan = new Student(10, " Prokash Chandra Roy " , 85.5f)
    // Here, 'this' will be replaced with Aryan.
    Student(int rno, String name, float marks) {    // This is the correct way to initialize an object
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
