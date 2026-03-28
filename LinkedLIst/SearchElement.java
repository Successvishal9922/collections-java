package LinkedLIst;

import java.util.LinkedList;
import java.util.Scanner;

class InnerSearchElement {

    
}

public class SearchElement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> L = new LinkedList<>();
        System.out.println("Add elements in List");

        for (int i = 0; i < 15   ; i++) {
            int num = sc.nextInt();
            L.add(num);
        }

        System.out.println("enter ele you want to search");

        int ele = sc.nextInt();

        
            if (L.contains(ele)) {
                System.out.println("Element is present in List");
            
            } 
            
            else {
                System.out.println("Element is missing...");
            }
            
        sc.close();
    }
}
