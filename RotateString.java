class RotateString {
    public boolean rotateString(String s, String goal) {
      return s.length() == goal.length() && (s + s).contains(goal);
    }
  
    public static void main(String[] args) {
      RotateString rotateString = new RotateString();
  
      String s = "abcde";
      String goal = "cdeab";
      
      if (rotateString.rotateString(s, goal)) {
        System.out.println("The string \"" + goal + "\" is a rotation of \"" + s + "\".");
      } else {
        System.out.println("The string \"" + goal + "\" is NOT a rotation of \"" + s + "\".");
      }
    }
  }
  