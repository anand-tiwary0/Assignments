package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Random;

public class Customarraylist {
    private int[] arr;
    public static int DEFAULT_SIZE = 10;
    private int size=0; //this will be used as index as well as capacity/actual data in the array of the array
    Customarraylist(){
        this.arr = new int[DEFAULT_SIZE];
    }


    //now add function
    public void add(int num){
        if(isfull()){
            resize();
        }
        arr[size++] = num;
    }

    private boolean isfull(){
        return this.size == this.arr.length;
    }
    private void resize(){
        int[] temp = new int[2 * this.arr.length];
        //copy old data
        for(int i=0 ; i<arr.length; i++){
            temp[i] = this.arr[i];
        }
        arr = temp;
    }

    //remove function
    public int remove(){
        int value = this.arr[size];  //this is last item
        size--;
        return value;
    }

    public int get(int index){
        return arr[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        this.arr[index] = value;
    }

    @Override
    public String toString() {
        return "Customarraylist{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Customarraylist list = new Customarraylist();
        list.add(344);
        list.add(34);
        list.add(78);

        Random rand = new Random();
        for(int i =0; i<21; i++){
            list.add(rand.nextInt(100));
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("this");   //here we won't be able to add string as during instantiation of object we explicitly told that this arraylist
//         will be of type integer

    }
}
