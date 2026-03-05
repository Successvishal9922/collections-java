import java.util.ArrayList;

public class arraylist_clone {
     public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Vishal");
        list1.add("Rahul");
        list1.add("Sneha");

        // Clone
        ArrayList<String> list2 = (ArrayList<String>) list1.clone();

        System.out.println("Original List: " + list1);
        System.out.println("Cloned List: " + list2);

        // Modify original
        list1.add("Prakash");
        System.out.println("\nAfter modifying original:");
        System.out.println("Original List: " + list1);
        System.out.println("Cloned List: " + list2);
    }
}
