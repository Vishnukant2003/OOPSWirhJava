package Array_assi_4;

public abstract class AvgSum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.err.println(sum);
        double average = (double) sum / arr.length;
        System.err.println(average);
    }

}
