package LinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveEvenNum {
    public static void main (String [] args){
        LinkedList <Integer> N = new LinkedList<>();
        N.add(5);
        N.add(4);
        N.add(3);
        N.add(2);
        N.add(1);
        N.add(0);
        N.add(7);
        N.add(6);
        N.add(9);

        System.out.println("Without any operation " + N);

        Iterator<Integer> L = N.iterator();
        while (L.hasNext()) {
            if (L.next()%2 == 0) {
                L.remove();
            }
        }
        System.out.println("After removing even number" + N);
    }
}
