public class RecursionBinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,55,67,78};

        System.out.println(binarySearchRecursion(array, 98, 0, array.length-1));
    }

    static int binarySearchRecursion(int[] arr, int target, int start, int end ){
        if(start>end)
            return -1;

        int m = start + (end-start) /2;

        if(arr[m] == target)
            return m;

        if(target < arr[m])
            return binarySearchRecursion(arr, target, start, m-1);

        return binarySearchRecursion(arr, target, m+1 , end);

    }
}
