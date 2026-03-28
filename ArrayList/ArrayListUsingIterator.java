package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterator {
    public static void main(String[]args){
        ArrayList<Integer> B = new ArrayList<>();
        B.add(10);
        B.add(15);
        B.add(20);
        B.add(25);
        B.add(30);
        B.add(35);

        System.out.println("using normal way " + B);

        for (int i = 0; i < B.size(); i++) {
            System.out.println("using for loop " + B.get(i));
        }

        System.out.println("using for each loop ");

        for (Integer integer : B) {
            System.out.println(integer);
        }

        System.out.println("");

        System.out.println("now using iterator ");

        Iterator<Integer>it = B.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("");

        System.out.println("remove elemet using Iterator ");


        Iterator<Integer> it2 = B.iterator(); 
        while (it2.hasNext()) {
            int elemet = it2.next() ;
            if (elemet == 25) {
                it2.remove();
               // System.out.println(elemet);
            }
            else{
                System.out.println(elemet);// it prits when if condition gets false 
            }
           
        }

    }
}
