public class Max {

    public static void main(String[] args) {

        int[] arr = {1, 1002, 100, 55, 78, 99998};

        System.out.println(max(arr));
    }

    static int  max(int[] array){
        if(array.length == 0){
            return -1;
        }
        int max=array[0];

        for (int i = 0; i < array.length-1; i++) {
            if(max < array[i+1]){
                max = array[i+1];
            }
        }
        return max;
    }
}
