import java.util.ArrayList;

public class collection_Arraylist{
    public static void main (String [] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Raju");
        list.add("sagar");
        list.add("avinash");
        System.out.println(list.get(0));
        list.add("vishal");
        list.add("Raju");
        System.out.println(list);
        list.add("arni");
        list.add("arvik");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list);
    }
}

     