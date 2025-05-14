import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/// Task 1
    int[][] arr = new int[10][10];
    int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                if (j < 100){
                    arr[i][j] = count++;
//                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    /// Task 2
//        int[][] arr = new int [5][5];
//        int count = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i >= j){
//                    arr[i][j] = count;
//                }
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
///  Task 3
//        int[][] arr = new int [5][5];
//        int count = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i >= j){
//                    arr[i][j] = count;
//                }
//                if (arr[i][j] > 0) {
//                    System.out.print(arr[i][j]);
//                }
//            }
//            System.out.println();
//        }
    }
}