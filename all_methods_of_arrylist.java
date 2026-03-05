import java.util.*;

public class all_methods_of_arrylist {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer>numbe = new ArrayList<>();
        numbe.add(25);
        numbe.add(25);
        numbe.add(78);
        numbe.add(45);
        numbe.add(88);
        numbe.add(45);
        numbe.add(87);
        numbe.add(22);
        numbe.add(88);
        numbe.add(63);
        numbe.add(72);

        System.out.println("aarylist " + numbe);
        System.out.println("index 5 "+numbe.get(5));
        numbe.add(5, 98);
        System.out.println(numbe.get(5));
        numbe.set(5, 32);
        System.out.println(numbe.get(5));
        System.out.println(numbe.remove(0));
        numbe.remove(Integer.valueOf(88));// removes first occurance of 88 
        System.out.println(numbe);
        System.out.println(numbe.isEmpty());
        System.out.println("element is avalable or not = " + numbe.contains(32) );
        
        System.out.println("element is avalable or not = " + numbe.contains(2) );
        
        System.out.println("first occurance = " + numbe.indexOf(45) );
        System.out.println("last occurance = " + numbe.lastIndexOf(45) );

        
        sc.close();
    }
}
