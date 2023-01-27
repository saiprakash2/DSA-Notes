import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {

    public static void main(String[] args) {

        System.out.println("Hello Multi Array List");

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> mulList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            mulList.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mulList.get(i).add(sc.nextInt());

            }
        }

        System.out.println(mulList);

    }
}
