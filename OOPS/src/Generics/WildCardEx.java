package Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardEx<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;       // also working as a index value

    public WildCardEx() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List < ? extends Number > list){
        // Do something

        // Here we can only pass Number type!
    }

    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
       Object[] temp = new Object[data.length * 2];

       // Copy the current items into the new Array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index , T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        WildCardEx list = new WildCardEx();
//        list.add(4);
//        list.add(6);
//        list.add(8);

//        for (int i = 0; i < 14; i++) {
//            list.add(3 * i);
//        }
//        System.out.println(list);

//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("asffa");


        WildCardEx<Integer> list3 = new WildCardEx();
        for (int i = 0; i < 14; i++) {
            list3.add(3 * i);
        }
        System.out.println(list3);
    }
}
