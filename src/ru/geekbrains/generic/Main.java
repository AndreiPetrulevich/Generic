package ru.geekbrains.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    ArrayList a = new ArrayList(Arrays.asList(1,2,3,4));
	    swap(a, 0, 1);
        System.out.println(a.toString());

        Integer [] counts = {1, 2, 3, 4, 5};
        System.out.println(transformToArrayList(counts));

        Box <Apple> box = new Box();
        Box <Orange> box1 = new Box();

    }

//    public static <T> T[] swap(T[] arr, int index1, int index2) {
//        ArrayList<T> copy = new ArrayList(Arrays.asList(arr));
//        swap(copy, index1, index2);
//        return (T[]) copy.toArray();
//    }

    public static <T> void swap(ArrayList<T> arr, int index1, int index2) throws IndexOutOfBoundsException {
        T element1 = arr.get(index1);
        T element2 = arr.get(index2);

        arr.set(index1, element2);
        arr.set(index2, element1);
    }

    public static <T> List<T> transformToArrayList(T[] arr) {
        if (arr != null) {
            List<T> list = new ArrayList();
            for(T element : arr) {
                list.add(element);
            }
            return list;
        }
        return new ArrayList<>();
    }



}
