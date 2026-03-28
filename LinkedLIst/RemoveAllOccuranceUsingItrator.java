package LinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveAllOccuranceUsingItrator {
    public static void main(String[]args){
        LinkedList<Integer> A = new LinkedList<>();
        A.add(45);
        A.add(45);
        A.add(55);
        A.add(85);
        A.add(45);
        A.add(96);
        A.add(45);
        A.add(45);


        Iterator<Integer> B = A.iterator();
        while (B.hasNext()) {
            System.out.println(B.next());
        }
        System.out.println("remove all occurance");

        Iterator <Integer> L = A.iterator();
        while (L.hasNext()) {
            if (L.next() == 45) {
                L.remove();
            }
        }
        System.out.println( "After removing all ocurance of 45 " + A);

    }
}
