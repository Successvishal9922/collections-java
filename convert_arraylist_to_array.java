import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class convert_arraylist_to_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            System.out.println("entetr name");
            String n = sc.nextLine();
            name.add(n);
        }
        System.out.println("");
        String[]arr = name.toArray(new String[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
        Integer[] arr1 = new Integer[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(arr1));
        System.out.println("after covertiong to arraylist "+ num);
        sc.close();

    }
}
