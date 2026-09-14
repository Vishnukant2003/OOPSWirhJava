package Array_assi_4;

import java.util.Scanner;

public class Sumof {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]);
        }

        int firsthalf = 0;
        int secondhalf = 0;
        int mid = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                firsthalf += arr[i];
            } else {
                secondhalf += arr[i];

            }
        }

        System.out.println(" first half sum :" + firsthalf);
        System.out.println(" seecond half sum : " + secondhalf);
    }
}
