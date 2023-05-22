package edu.itstep.first;

public class Main6 {
    public static void main(String[] args) {
        //switch
        int number = 1;
        switch (number) {
            case 1: {
                String word = "one";
                System.out.println("one");
            }
            break;
            case 2: {
                String word = "two";
                System.out.println("two");
            }
            break;
            default:
                System.out.println("error");

        }


        if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else {
            System.out.println("error");
        }
    }
}
