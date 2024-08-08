public class LongestSubstringWReapeating { 
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] count = new int[128]; 
  
        for (int l = 0, r = 0; r < s.length(); ++r) {
            ++count[s.charAt(r)]; 
            while (count[s.charAt(r)] > 1)
                --count[s.charAt(l++)]; 
            ans = Math.max(ans, r - l + 1); 
        }
  
        return ans; 
    }

    public static void main(String[] args) {
        LongestSubstringWReapeating solution = new LongestSubstringWReapeating();
        
        
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";
        String test4 = "";
        String test5 = "abcdefg";

        System.out.println("Length of longest substring without repeating characters in '" + test1 + "' is: " + solution.lengthOfLongestSubstring(test1)); // Output: 3
        System.out.println("Length of longest substring without repeating characters in '" + test2 + "' is: " + solution.lengthOfLongestSubstring(test2)); // Output: 1
        System.out.println("Length of longest substring without repeating characters in '" + test3 + "' is: " + solution.lengthOfLongestSubstring(test3)); // Output: 3
        System.out.println("Length of longest substring without repeating characters in '" + test4 + "' is: " + solution.lengthOfLongestSubstring(test4)); // Output: 0
        System.out.println("Length of longest substring without repeating characters in '" + test5 + "' is: " + solution.lengthOfLongestSubstring(test5)); // Output: 7
    }
}
