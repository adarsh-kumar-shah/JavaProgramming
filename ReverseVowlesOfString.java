public class ReverseVowlesOfString {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !isVowel(sb.charAt(l)))
                ++l;
            while (l < r && !isVowel(sb.charAt(r)))
                --r;
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            ++l;
            --r;
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        ReverseVowlesOfString obj = new ReverseVowlesOfString();

        String input1 = "hello";
        String input2 = "leetcode";
        String input3 = "aA";

        System.out.println("Original: " + input1 + " -> Reversed: " + obj.reverseVowels(input1));
        System.out.println("Original: " + input2 + " -> Reversed: " + obj.reverseVowels(input2));
        System.out.println("Original: " + input3 + " -> Reversed: " + obj.reverseVowels(input3));
    }
}
