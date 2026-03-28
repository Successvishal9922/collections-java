package LinkedLIst;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> L = new LinkedList<>();
        System.out.println("Add Number in Linked list");

        for (int i = 0; i < 15; i++) {
            int num = sc.nextInt();
            L.add(num);
        }

        System.out.println("Adding is end ");

        int max = L.get(0);

        for (Integer integer : L) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println("Maximum Num = " + max);
        sc.close();
    }
}
