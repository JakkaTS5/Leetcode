import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        ConcatenationOfArray run = new ConcatenationOfArray();
        int[] a = { 1, 3, 2 };
        System.out.println(Arrays.toString(run.getConcatenation(a)));
    }

    public int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];
        int a = 0;
        for (int i = 0; i < nums.length * 2; i++) {

            if (i >= nums.length) {
                output[i] = nums[a];
                a++;
            } else {
                output[i] = nums[i];
            }
        }
        return output;
    }
}
