package AccessControl;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // We will go in details of how to create it in hashmap lecture.
    // HashCode is basically a number representation of an object.
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(50);
//        ObjectDemo obj1 = new ObjectDemo(90);
//        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());


        ObjectDemo obj2 = new ObjectDemo(12,80.6f);
        ObjectDemo obj3 = new ObjectDemo(12,78.5f);
        if(obj2 == obj3){
            System.out.println("Obj2 is equal to Obj3");
        }
        if(obj2.equals(obj3)){
            System.out.println("Obj2 is equal to Obj3");
        }
    }
}
