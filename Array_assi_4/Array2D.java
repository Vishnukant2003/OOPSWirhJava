package Array_assi_4;

public class Array2D {
    public static void main(String[] args) {
    int[][] arr = new int[4][5];
    int[][] arr2 = new int[4][5];
    int[][] sum = new int[4][5];

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<5;j++){
            arr[i][j] = 1 + (int)(Math.random() *100);
        }
    }
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<5;j++){
            arr2[i][j] = 1 + (int)(Math.random() *100);
        }
    }
    
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println(" arr 1");

    
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<5;j++){
                System.out.print(arr2[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println(" arr 2");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<5;j++){
           sum[i][j] = arr[i][j] + arr2[i][j];       
        }
    }
    
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<5;j++){
                System.out.print(sum[i][j]+" ");
        }
        System.out.println();
    }
  }

}
