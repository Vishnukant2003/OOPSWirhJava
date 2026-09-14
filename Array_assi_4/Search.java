package Array_assi_4;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();

    int[] arr={20,10,30,50,520,50};


    for(int i =0; i<arr.length; i++){
        if (search == arr[i]) {
            System.err.println("search successfully: "+search);
        }

    }
}
}