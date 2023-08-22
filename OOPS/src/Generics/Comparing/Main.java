package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Aryan = new Student(10, 87.75f);
        Student Das = new Student(7, 89.3f);
        Student Himadri = new Student(8, 95.5f);
        Student sadist = new Student(9, 77.7f);
        Student Tanmoy = new Student(12, 84.5f);

        Student[] List = {Aryan , Das , Himadri , sadist , Tanmoy};
        System.out.println(Arrays.toString(List));
//        Arrays.sort(List, new Comparator<Student>() {         // new Comparator method
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.Marks - o2.Marks);         // it is in Descending order
//            }
//        });


        Arrays.sort(List, (o1, o2) -> {                 // Using lambda functions   " -> " 
            return (int)(o1.Marks - o2.Marks);         // it is in Ascending order
        });
        System.out.println(Arrays.toString(List));


//        if (Aryan.compareTo(Das) < 0) {
//            System.out.println(Aryan.compareTo(Das) < 0 );
//            System.out.println("Das is the best xD ");
//        }
    }
}
