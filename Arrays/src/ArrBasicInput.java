import java.util.Scanner;
public class ArrBasicInput {
    public static void main(String[] args) {
        System.out.println("Let's learn about Arrays in Java!");

        /* Arrays: It is a data structure that stores data of the same type in a sequential manner. An array takes a
                    contiguous section of the memory.
         */

        // Given the marks of students in a classroom, calculate the average marks. Assume class size to be 10.
        int[] marks = new int[10];
        marks[0] = 89;
        System.out.println(marks[0]);

        System.out.println(marks); // It will only print the memory address.

        int[] marks2 = {50, 55, 60, 65, 70, 75, 80, 85, 90, 95};
        System.out.println(marks2[3]);

        String[] names = new String[2];
        names[0] = "Prokash";
        names[1] = "Roy";
        System.out.println(names.length);

        // Taking input in an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Showing the ouput of an array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" At Index " + i + "  value= "+ arr[i]);
        }
    }
}