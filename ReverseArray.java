
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 1002, 100, 55, 78, 99998, 75, 52 ,24 , 2245};

        reverseArray(arr);

    }

    static void reverseArray(int[] array){
        int start = 0;
        int end = array.length-1;

        for (int i = 0; i < Math.ceil(array.length / 2); i++) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }
}
