import java.util.ArrayList;
import java.util.Scanner;

public class adding_no_arraylist {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("add numbers");
    ArrayList<Integer>num = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
        System.out.println("enter no"+ i);
        int number = sc.nextInt();
        num.add(number);

    }
    System.out.println(num);
    num.remove(0);
    System.out.println(num);
    num.set(1, 10);
    System.out.println(num);
    num.add(3, 30);
    System.out.println(num);
    System.out.println("contains 50 " + num.contains(50));
    sc.close();
    }
    
}
