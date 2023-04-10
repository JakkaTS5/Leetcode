import java.util.Arrays;

public class SapXepChon {
    public static void main(String[] args) {
        double arr[] = {1, 4, 5, 2, 8};
        sapXepChon(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sapXepChon(double[] arr) {
        int i, j, min;
        int n = arr.length;
        //di chuyển di chuyen ranh gioi cua mang da sap xep va chua
        for (i = 0; i < n - 1; i++) {
            // tìm phần tử nhỏ nhất của mang chưa sắp xếp
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    // đổi chỗ phần tử nhỏ nhất vs phần tử đầu tiên
                    double temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }

            }

        }
    }
}
