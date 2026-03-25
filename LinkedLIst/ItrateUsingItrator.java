package LinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class ItrateUsingItrator {
    public static void main(String[]args){
        LinkedList <Integer> A = new LinkedList<>();
        A.add(45);
        A.add(55);
        A.add(65);
        A.add(75);
        A.add(85);
        A.add(95);
        A.add(25);
        A.add(35);
        Iterator <Integer> L = A.iterator();
        while (L.hasNext()) {
            System.out.println(L.next());
        }
    }
}
