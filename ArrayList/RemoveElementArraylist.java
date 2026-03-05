package ArrayList;

import java.util.ArrayList;

public class RemoveElementArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>();
        B.add(10);
        B.add(15);
        B.add(20);
        B.add(25);
        B.add(30);
        B.add(35);

        System.out.println("Before Remove : " + B);

        B.remove(2);

        System.out.println("After Remove : " + B);

        for (int i = 0; i < B.size(); i++) {
            System.out.println("using for loop After remove element : " + B.get(i));
        }

        System.out.println("");

        for (Integer ele : B) {
            System.out.println("using for each after removing element : " + ele);
        }

    }
}
