public class MajorityElement {

    public int majorityElement(int[] nums) {
        Integer ans = null;
        int count = 0;

        for (final int num : nums) {
            if (count == 0)
                ans = num;
            count += num == ans ? 1 : -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2}; 

        int result = majorityElement.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
