class ReverseString {
    public void reverseString(char[] s) {
      int l = 0;
      int r = s.length - 1;
  
      while (l < r) {
        char temp = s[l];
        s[l++] = s[r];
        s[r--] = temp;
      }
    }
  
    public static void main(String[] args) {
      ReverseString obj = new ReverseString();
      
      char[] s = {'h', 'e', 'l', 'l', 'o'};
      
      System.out.println("Before reversing: " + new String(s));
      
      obj.reverseString(s);
      
      System.out.println("After reversing: " + new String(s));
    }
  }
  