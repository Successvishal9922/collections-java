package LinkedLIst;

import java.util.LinkedList;
import java.util.Scanner;

class SearchElementn {
    public void Search(LinkedList<Integer>L,int ele){
        if (L.contains(ele)) {
            System.out.println("Element is present in a list");
        } else {
            System.out.println("element is not present");
        }
    }
    
}

public class SearchEleUsingAnotherClass {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>L = new LinkedList<>();
        System.out.println("Enter LIst Elements");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            L.add(num);
        }
        System.out.println("Enter ele you want to Search");
        int ele = sc.nextInt();

        SearchElementn S = new SearchElementn();
        S.Search(L, ele);
        sc.close();
    }
}
