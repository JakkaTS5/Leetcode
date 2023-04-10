import java.util.Arrays;

public class SapXepChen {
    public static void main(String[] args) {
        double arr[] = {1, 4, 5, 2, 8};
        sapXepChen(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sapXepChen(double[] arr) {
        int n = arr.length;
        int i, j;
        double key;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
