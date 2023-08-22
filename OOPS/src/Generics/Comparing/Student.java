package Generics.Comparing;

public class Student implements Comparable<Student> {
    int RollNo;
    float Marks;

    public Student(int rollNo, float marks) {
      this.RollNo = rollNo;
        this.Marks = marks;
    }

    @Override
    public String toString() {
        return Marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("in compareTo method ");
        int diff = (int)(this.Marks - o.Marks);

        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller.

        return diff;                                 // It's not a convention way to do compare classes
                                                    // Convention way to do it , is to use 'compare.to' method
    }
}

