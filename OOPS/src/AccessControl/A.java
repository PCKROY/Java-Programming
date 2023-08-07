package AccessControl;

public class A {
    protected int num;      // we can use   private int num;
    String name;
    int[] arr;

    //  We can use getter and setter methods to access the private properties
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
