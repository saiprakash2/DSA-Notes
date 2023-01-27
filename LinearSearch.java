public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 45, 57 ,484};

        int ans = linearSearch1(arr, 1);
        int ele = linearSearch2(arr, 1);

        System.out.println(ans);
        System.out.println(ele);
    }


    static int linearSearch1(int[] array, int target){

        if(array.length == 0)
            return -1;


        for (int i = 0; i < array.length; i++) {
            if(array[i]==target)
                return i;
        }

        return -1;
    }

    static int linearSearch2(int[] array, int target){

        if(array.length == 0)
            return -1;

        for (int element : array){
            if(element== target)
                return element;
        }

        return -1;
    }
}
