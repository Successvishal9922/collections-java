import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist_String_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            System.out.println("enter the names");
            String n = sc.nextLine();
            name.add(n);
        }

        Collections.sort(name);// accending order
        System.out.println("accending order = " + name);
        Collections.sort(name, Collections.reverseOrder());
        System.out.println("decending order = " + name);
        sc.close();
    }
}
