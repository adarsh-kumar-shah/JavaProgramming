class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (final int num : nums)
            if (num != val)
                nums[i++] = num;

        return i;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();
        
        int[] nums = {3, 2, 2, 3};  
        int val = 3;                
        
        int newLength = solution.removeElement(nums, val);
        
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
