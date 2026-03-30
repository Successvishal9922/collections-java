package HashSet;

import java.util.HashSet;

public class AddElements {
    public static void main(String[]args){
        HashSet<Integer>H=new HashSet<>();
        H.add(12);
        H.add(12);
        H.add(12);
        H.add(12);
        H.add(null);
        H.add(12);
        H.add(13);
        
        System.out.println(H);
    }

    
}
