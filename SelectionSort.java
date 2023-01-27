import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("*--------Selection Sort-----------*");

        //Selection Sort

        //Select largest element and swap it to last for asc sorting

        //Consider [4 , 5, 1, 2, 3]
        //5 is greater here and swap it with 3 which is its right index or position
        //[4, 3, 1, 2, 5] last position is sorted

        //[4, 3, 1, 2, 5]
        //Now pick 4 and swap it with 2 which is its right index or position
        //[2, 3, 1, 4, 5] last two position are sorted

        //repeat the same and you will end up with
        //[1, 2, 3, 4, 5]

        //Complexity is O(n^2)

        int[] arr = {2, -5, 2, -10, 0};

        System.out.println("original array " + Arrays.toString(arr));

        selectionSort(arr);
    }

    static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int last = array.length - i -1;
            int maxIndex = getMaxIndex(array, 0, last);
            swap(array, maxIndex, last);
        }
        System.out.println("Array is sorted " + Arrays.toString(array));
    }

    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
