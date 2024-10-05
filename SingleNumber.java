import java.util.Scanner;

class SingleNumber {
  public int singleNumber(int[] nums) {
    int ans = 0;

    for (final int num : nums) {
      ans ^= num;
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();
    int[] nums = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    SingleNumber solution = new SingleNumber();
    int result = solution.singleNumber(nums);

    System.out.println("The single number is: " + result);
  }
}

