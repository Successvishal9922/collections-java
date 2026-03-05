import java.util.ArrayList;
import java.util.Scanner;

public class remove_duplicates_arraylist {
    public static void main(String[]args){
        ArrayList<Integer>element = new ArrayList<>();
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("enter element");
            int elements = Sc.nextInt();
            element.add(elements);

        }
        System.out.println("elements " + element );

        for (int i = 0; i < element.size(); i++) {
            for (int j = i+1; j < element.size(); j++) {
                if (element.get(i).equals(element.get(j))) {
                    element.remove(j);
                    j--;
                }
            }
            
        }
        System.out.println("after removing duplicates " + element);

    Sc.close();
    }
}
