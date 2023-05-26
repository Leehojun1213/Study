import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Main16 {
    public static void main(String[] args){
       Scanner std = new Scanner(System.in);

    System.out.println("요소수?");
    int x = std.nextInt();
    int[] q = new int[x];
        System.out.println("숫자?");
        for(int i=0; i<q.length; i++){
           q[i] = std.nextInt();  
        }
        for(int i=0; i < x; i++){
            System.out.println("a[" + i + "] =" + q[i]);
        }
        System.out.print("{");
        if (x >= 2){
            for(int i=0; i < x; i++){

                System.out.print(q[i] + ",");
                }
                System.out.print(q[x-1]);
                
            }
        if ( x == 1)
                System.out.print(q[0]);

        System.out.print("}");
    }
}
