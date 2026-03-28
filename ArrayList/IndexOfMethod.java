package ArrayList;

import java.util.ArrayList;

public class IndexOfMethod {
     public static void main(String[]args){
        ArrayList<Integer> B = new ArrayList<>();
        B.add(10);
        B.add(15);
        B.add(20);
        B.add(20);
        B.add(30);
        B.add(30);

        System.out.println(B.indexOf(30));
        System.out.println(B.lastIndexOf(20));
        System.out.println(B.lastIndexOf(30));
     }
}
