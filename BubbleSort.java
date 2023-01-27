import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        //Bubble Sort



        int[] arr = {2, -5, 2, -10, 0};

        System.out.println("original array " + Arrays.toString(arr));

        bubbleSort(arr);
    }

    static void bubbleSort(int[] array){
        System.out.println("bubble sort" + Arrays.toString(array));
    }


}
