package edu.itstep.first;

public class Main12 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 7, 7, 7};

        //itar
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //iter
        for (int i : arr) {
            i = 5;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
