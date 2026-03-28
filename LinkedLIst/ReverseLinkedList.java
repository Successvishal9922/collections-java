package LinkedLIst;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer> L = new LinkedList<>();

        System.out.println("add eleents");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            L.add(num);
        }
        System.out.println("number is added successfully");
        Collections.reverse(L);
        
        System.out.println("i can diectly reversed but i use iterator to see");

        Iterator <Integer> N = L.iterator();
        while (N.hasNext()) {
            System.out.println(N.next());
        }
        sc.close();
    }
}
