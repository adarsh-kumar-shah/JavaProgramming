public class NimGame {
    public boolean canWinNim(int n) {
      return n % 4 != 0;
    }
  
    public static void main(String[] args) {
      NimGame game = new NimGame();
  
      int n = 4; 
      if (game.canWinNim(n)) {
        System.out.println("You can win the game with " + n + " stones.");
      } else {
        System.out.println("You will lose the game with " + n + " stones.");
      }
    }
  }
  