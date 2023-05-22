package edu.itstep.first;

public class Main13 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[1][2] = 7;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
