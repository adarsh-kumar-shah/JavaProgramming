class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
      int i = s.length() - 1;
  
      while (i >= 0 && s.charAt(i) == ' ')
        --i;
      final int lastIndex = i;
      while (i >= 0 && s.charAt(i) != ' ')
        --i;
  
      return lastIndex - i;
    }
  
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
  
      String s1 = "Hello World";
      String s2 = "   fly me   to   the moon  ";
      String s3 = "luffy is still joyboy";
      String s4 = "a";
  
      
      System.out.println("Test Case 1: " + solution.lengthOfLastWord(s1)); // Expected: 5
      System.out.println("Test Case 2: " + solution.lengthOfLastWord(s2)); // Expected: 4
      System.out.println("Test Case 3: " + solution.lengthOfLastWord(s3)); // Expected: 6
      System.out.println("Test Case 4: " + solution.lengthOfLastWord(s4)); // Expected: 1
    }
  }
  