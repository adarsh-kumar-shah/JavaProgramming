import java.util.HashMap;
import java.util.Map;

class DistinctString {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> count = new HashMap<>();

        for (final String a : arr)
            count.merge(a, 1, Integer::sum);

        for (final String a : arr)
            if (count.get(a) == 1 && --k == 0)
                return a;

        return "";
    }

    public static void main(String[] args) {
        DistinctString solution = new DistinctString();
        String[] arr = {"a", "b", "a", "c", "b", "c", "d"};
        int k = 1;
        System.out.println(solution.kthDistinct(arr, k));  
        k = 2;
        System.out.println(solution.kthDistinct(arr, k));  
        String[] arr2 = {"a", "b", "c", "a", "b", "d"};
        k = 2;
        System.out.println(solution.kthDistinct(arr2, k)); 
    }
}
