package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;       // also working as a index value

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
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
        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(4);
//        list.add(6);
//        list.add(8);

//        for (int i = 0; i < 14; i++) {
//            list.add(3 * i);
//        }
//        System.out.println(list);

//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("asffa");


        CustomGenArrayList<Integer> list3 = new CustomGenArrayList();
        for (int i = 0; i < 14; i++) {
            list3.add(3 * i);
        }
        System.out.println(list3);




    }
}
