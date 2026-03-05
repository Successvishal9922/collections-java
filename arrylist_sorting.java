import java.util.*;

public class arrylist_sorting {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> ele = new ArrayList<>(12);

        for (int i = 0; i <= 12; i++) {
            System.out.println("enter elements");
            int element = sc.nextInt();
            ele.add(element);
            
        }

        System.out.println(ele);
        Collections.sort(ele);
        System.out.println("after sorting in accending = " + ele);
        Collections.sort(ele ,Collections.reverseOrder());
        System.out.println("after sorting in decending = " + ele);
        sc.close();
    }
}
