package Array_assi_4;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int largets = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largets) {
                largets = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];

            }

        }
        System.err.println(" largest: " + largets + " smallest  " + smallest);
    }
}
