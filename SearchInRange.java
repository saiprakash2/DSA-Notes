public class SearchInRange {

    public static void main(String[] args) {

        int[] arr = {1, 2, 45, 57 ,484};

        int ans = linearSearch1(arr, 45, 0 ,5);

        System.out.println(ans);
    }

    static int linearSearch1(int[] array, int target, int start, int end ){

        if(array.length == 0 & start > array.length-1 & end > array.length-1)
            return -1;

        for (int i = start; i <= end; i++) {
            if(array[i]==target)
                return i;
        }

        return -1;
    }
}
