import java.util.ArrayList;
import java.util.Scanner;

public class add_name_using_methods_of_arraylist {
    public static void main(String[]args){
        ArrayList<String>name = new ArrayList<>();
        System.out.println(name.isEmpty());
        Scanner sc = new Scanner(System.in);        
        for (int i = 0; i < 4 ; i++) {
            System.out.println("enter names");
            String names = sc.next();
            name.add(names);
        }
        System.out.println(name);
        
        System.out.println("adding element between index");
        name.add(2,"sagar");
        System.out.println("update index");
        name.set(2, "arvik");
        System.out.println("after adding and set name"+name);
        name.remove(1);
        System.out.println("after remove element "+name);
        System.out.println(name.size());
        System.out.println("contains vishal"+name.contains("visha")+"");
        name.clear();
        System.out.println("remove all elements"+name);
        sc.close();
    }
}
