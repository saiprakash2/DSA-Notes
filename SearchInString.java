import java.util.Arrays;

public class SearchInString {

    public static void main(String[] args) {

        String name = "Sai";

        char letter = 'i';

        int[] arr = {1 , 2, 4 , 55};
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toCharArray());

        System.out.println(linearSearchString(name, letter));


    }

    static boolean linearSearchString(String str, char target){

        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
                return true;
        }

        return false;

    }
}
