import java.util.*;

class MaximumDist {
  public int maxDistance(List<List<Integer>> arrays) {
    int ans = 0;
    int mn = 10000;
    int mx = -10000;

    for (List<Integer> A : arrays) {
      ans = Math.max(ans, Math.max(A.get(A.size() - 1) - mn, mx - A.get(0)));
      mn = Math.min(mn, A.get(0));
      mx = Math.max(mx, A.get(A.size() - 1));
    }

    return ans;
  }

  public static void main(String[] args) {
    MaximumDist solution = new MaximumDist();

    List<List<Integer>> arrays = new ArrayList<>();
    arrays.add(Arrays.asList(1, 2, 3));
    arrays.add(Arrays.asList(4, 5, 6));
    arrays.add(Arrays.asList(7, 8, 9));

    int result = solution.maxDistance(arrays);

    System.out.println("The maximum distance is: " + result);
  }
}
