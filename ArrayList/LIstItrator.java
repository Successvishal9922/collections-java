package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class LIstItrator {
    public static void main(String[]args){
        ArrayList<Integer> B = new ArrayList<>();
        B.add(10);
        B.add(15);
        B.add(20);
        B.add(25);
        B.add(30);
        B.add(35);

        ListIterator<Integer> Lt1 = B.listIterator();
        System.out.println("performs forword operation");
        while (Lt1.hasNext()) {
            System.out.println(Lt1.next());
        }

        ListIterator<Integer>Lt2 = B.listIterator();

        System.out.println("perform forword + add operation");

        while (Lt2.hasNext()) {
            int elemet = Lt2.next();
            if (elemet == 20) {
                Lt2.add(50);
            }
                System.out.println(elemet);
        
        }
        System.out.println(B);

        System.out.println("");
        System.out.println("now we perform set operation using list itrator ");

        ListIterator<Integer> Lt3 = B.listIterator();

        while (Lt3.hasNext()) {
            int elemet = Lt3.next();
            if (elemet == 10) {
                Lt3.set(88);
            }
            System.out.println(elemet);
        }
        System.out.println(B);

        System.out.println("");
        System.out.println("now iam performing privious operation ");

        ListIterator<Integer> Lt4 = B.listIterator(B.size());
        while (Lt4.hasPrevious()) {
            
            System.out.println(Lt4.previous());
        }
    }

}
