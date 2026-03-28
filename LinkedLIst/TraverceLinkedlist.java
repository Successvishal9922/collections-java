package LinkedLIst;

import java.util.LinkedList;

public class TraverceLinkedlist {
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

        for (int i = 0; i < A.size(); i++) {
            System.out.println("N  " + i + " = " + A.get(i));
        }
        
    }
}
