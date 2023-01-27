import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,},
                {4,5,44425,6,4,5,6,6,44425,553,43},
                {6,7,8}
        };




        int[] ans = linearSearchIn2DArray(matrix, 8);
        System.out.println("answer is "  + Arrays.toString(ans));

        System.out.println("Max value is " + linearSearchIn2DArrayMaxValue(matrix));

    }

    static  int[] linearSearchIn2DArray(int[][] arr, int target){

        if(arr.length == 0){
            System.out.println("nothing there in the array");
            return new int[]{-1, -1};
        }


        for(int row = 0 ; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }

            }
        }
        return new int[]{-1, -1};
    }

    static int linearSearchIn2DArrayMaxValue(int[][] arr){

        int max = Integer.MIN_VALUE;

        if(arr.length == 0){
            System.out.println("nothing there in the array");
            return max;
        }


        for(int row = 0 ; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;

    }
}
