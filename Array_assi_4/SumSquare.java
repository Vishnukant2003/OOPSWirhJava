package Array_assi_4;

import java.util.Scanner;

public class SumSquare {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 1; i < arr.length; i += 2) {
            int square = arr[i] * arr[i];
            System.err.println(" " + arr[i] + " :" + square);
        }
    }

}
