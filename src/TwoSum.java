import java.util.Arrays;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class TwoSum {
    public static void main(String[] args) {
        int [] a = {1,2,6,2};
        System.out.println(Arrays.toString(twoSum(a,8)));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

