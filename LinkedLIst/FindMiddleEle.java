package LinkedLIst;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMiddleEle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer> L = new LinkedList<>();

        System.out.println("Add elements");

        for (int i = 0; i < 10; i++) {
            int ele = sc.nextInt();
            L.add(ele);
        }

        int mid = L.size()/2;

        System.out.println(L);
        System.out.println("middle = " + L.get(mid));
        sc.close();
    }
}
