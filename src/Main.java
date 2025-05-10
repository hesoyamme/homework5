import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[][] arr = new int[10][10];
    int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < 100){
                    arr[i][j] = count++;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}