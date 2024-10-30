class AddDigits {
    public int addDigits(int num) {
      return 1 + (num - 1) % 9;
    }
  
    public static void main(String[] args) {
      AddDigits solution = new AddDigits();
      
      int num = 38; 
      int result = solution.addDigits(num);
      
      System.out.println("The result of adding digits of " + num + " is: " + result);
    }
  }
  