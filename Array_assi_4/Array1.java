package Array_assi_4;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.err.println();

        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + "  ");
        }
    }
}
