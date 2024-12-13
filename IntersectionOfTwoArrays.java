import java.util.*;
import java.util.stream.Collectors;

class IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> ans = new ArrayList<>();
    Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

    for (final int num : nums2)
      if (set.remove(num))
        ans.add(num);

    return ans.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();

    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};

    int[] result = solution.intersection(nums1, nums2);

    System.out.println("Intersection: " + Arrays.toString(result));
  }
}
