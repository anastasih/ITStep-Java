package edu.itstep.first;

public class Main10 {
    public static void main(String[] args) {
        // унарные бинарные тернарные
//        int count = 1;
//        count++;
//        System.out.println(-count);
//        System.out.println(1 - 2);

        int number = 1;
//        String result;
//        if (number >= 0) {
//            result = "positive";
//        } else {
//            result = "negative";
//        }
//        System.out.println(result);

//        String result = (number >= 0) ? "positive" : "negative";
//        System.out.println(result);

        //String result = (number >= 0) ? System.out.println("positive") : System.out.println("negative");

        String result = (number >= 0) ? returnPositive() : returnNegative();
        System.out.println(result);
    }
    public static String returnNegative(){
        return "negative";
    }
    public static String returnPositive(){
        return "positive";
    }
}
