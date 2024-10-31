class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
    
        for (final int bill : bills) {
          if (bill == 5) {
            ++count5;
          } else if (bill == 10) {
            --count5;
            ++count10;
          } else { // bill == 20
            if (count10 > 0) {
              --count10;
              --count5;
            } else {
              count5 -= 3;
            }
          }
          if (count5 < 0)
            return false;
        }
    
        return true;
      }
public static void main(String[] args) {
    LemonadeChange solution = new LemonadeChange();
    
    int[] bills1 = {5, 5, 5, 10, 20};
    int[] bills2 = {5, 5, 10, 10, 20};
    int[] bills3 = {5, 5, 5, 10, 5, 20, 5, 10, 5, 20};
    
    System.out.println(solution.lemonadeChange(bills1)); // Expected output: true
    System.out.println(solution.lemonadeChange(bills2)); // Expected output: false
    System.out.println(solution.lemonadeChange(bills3)); // Expected output: true
  }

}
