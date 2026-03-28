package LinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveOperation {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Integer> A = new LinkedList<>();

        // Adding elements to the list
        A.add(45);
        A.add(55);
        A.add(55);
        A.add(55);
        A.add(85);
        A.add(55);
        A.add(65);
        A.add(65);
        A.add(65);
        A.add(35);
        A.addLast(65); // Adds element at the end

        // Remove element at index 5 (0-based index)
        A.remove(5);

        // Using Iterator to traverse and print elements
        Iterator<Integer> L = A.iterator();
        while (L.hasNext()) {
            System.out.println(L.next()); // Print each element
        }

        // Removes the LAST occurrence of value 55
        A.removeLastOccurrence(55);
        System.out.println("Remove last occurrence: " + A);

        // Removes the FIRST occurrence of value 55
        A.removeFirstOccurrence(55);
        System.out.println("Remove first occurrence: " + A);

        // Removes the FIRST element from the list
        A.removeFirst();
        System.out.println("Remove first element: " + A);

        // Removes the LAST element from the list
        A.removeLast();
        System.out.println("Remove last element: " + A);

        // Removes the first element (same as removeFirst())
        A.remove();
        System.out.println("Remove using remove(): " + A);

        // Removes all elements from the list (best method)
        A.clear();
        System.out.println("After clearing list: " + A);

    }
}
/*
🔥 Quick Revision (Interview Ready 💯)

👉 add() → add element
👉 addLast() → add at end
👉 remove(index) → remove by index
👉 removeFirstOccurrence(x) → remove first match
👉 removeLastOccurrence(x) → remove last match
👉 removeFirst() → remove first element
👉 removeLast() → remove last element
👉 remove() → same as removeFirst
👉 clear() → remove all elements
*/                        