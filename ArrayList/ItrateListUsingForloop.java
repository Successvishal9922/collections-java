package ArrayList;

import java.util.ArrayList;

public class ItrateListUsingForloop {
    public static void main(String[]args){
        ArrayList<Integer> B = new ArrayList<>();
        B.add(10);
        B.add(15);
        B.add(20);
        B.add(25);
        B.add(30);
        B.add(35);

        for (int i = 1; i < B.size(); i++) {
            System.out.println("INdex : " + i + " = "  + B.get(i) );
        }
    }
}
