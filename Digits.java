//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Digits {

    public static void main(String[] args) {
        int[] array = {-11,23,65,789, 1222};

        System.out.println("Total even digits = " + findNumbers(array));
        System.out.println("Total even digits Ultimate = " + findNumbersUltimate(array));
    }

    static int findNumbersUltimate(int[] nums) {
        int count = 0;

        for(int num: nums) {
            if((num >= 10 && num < 100) || (num >= 1000 && num < 10000) || (num >= 100000 && num < 1000000) || num == 1000000) count++;
        }

        return count;
    }

    static int findNumbers(int[] nums){
        int totalNums=0;
        for (int num : nums){
            if(evenDigitsUsingString(num))
                totalNums++;
        }
        return totalNums;
    }

    static boolean evenDigits(int num){
        if(num==0)
            return false;

        int count=0;

        while (num > 0){
            count++;
            num = num/10;
        }

        return count % 2 == 0;
    }

    static boolean evenDigitsUsingString(int num){
        if(num==0)
            return false;

        if(num<0)
            num = -num;

        String str = num + "";
        return str.length() % 2 == 0;
    }

    static int evenDigitsUsingLog(int num){
        if(num==0)
            return 0;

        if(num<0)
            num = -num;

        return (int)(Math.log10(num)) + 1;
    }
}
