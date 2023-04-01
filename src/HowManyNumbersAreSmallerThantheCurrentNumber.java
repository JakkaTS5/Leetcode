import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThantheCurrentNumber test = new HowManyNumbersAreSmallerThantheCurrentNumber();
        int[] nums = {3, 4, 2, 6, 7};
        System.out.println(Arrays.toString(test.smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
                output[i] = count;
            }
        }
        return output;
    }
}
