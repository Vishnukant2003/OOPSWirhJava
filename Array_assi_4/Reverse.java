package Array_assi_4;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.err.println(" Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.err.println("reverse : " + arr[i]);
        }

    }
}
