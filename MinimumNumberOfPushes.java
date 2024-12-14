import java.util.Arrays;

public class MinimumNumberOfPushes {
    public int minimumPushes(String word) {
        int ans = 0;
        int[] count = new int[26];

        for (final char c : word.toCharArray()) {
            ++count[c - 'a'];
        }

        Arrays.sort(count);

        for (int i = 0; i < 26; ++i) {
            ans += count[26 - i - 1] * (i / 8 + 1);
        }

        return ans;
    }

    
    public static void main(String[] args) {
        MinimumNumberOfPushes solution = new MinimumNumberOfPushes();
        String word = "example";
        int result = solution.minimumPushes(word);
        System.out.println("Minimum pushes required: " + result);
    }
}
