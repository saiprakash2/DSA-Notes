public class RecursionNumberPrint {

    public static void main(String[] args) {
        System.out.println(print(1));
    }

    static int print(int n){
        if(n!=5){
            System.out.println(n);
            return print(n+1);
        }

        return 0;
    }
}
