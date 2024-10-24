import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 1};

        boolean result = cd.containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}
