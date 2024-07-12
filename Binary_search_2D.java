import java.util.Arrays;

public class Binary_search_2D{
    public static void main(String[] args) {
        int[][] arr = {
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {19, 29, 39, 49},
                        {24, 34, 44, 54},


        };

        int target = 60;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}