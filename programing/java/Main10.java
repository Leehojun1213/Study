import java.util.Scanner;
import java.util.Random;


public class Main10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner (System.in);
        Random rand = new Random ();

        int R = rand.nextInt(3);

        switch (R) {
         case 0: System.out.println("gawi"); break;
         case 1: System.out.println("bawi"); break;
         case 2: System.out.println("bo"); break;       
        }
        
    //     System.out.print("a: ");     int a = stdIn.nextInt();
    //     System.out.print("b: " );    int b = stdIn.nextInt();
    //     System.out.print("c: " );    int c = stdIn.nextInt();

    //     if ( a < b){
    //         int q = a;
    //         a = b;
    //         b = q;

    //     }if (a < c){
    //             int e = a;
    //             a = c;
    //             c = e;
        
    //     }if (b < c){
    //         int w = b;
    //         b = c;
    //         c = w;
    //     }

    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);



    
 //3 -11
    // System.out.println(a - b <= 10 && b - a <= 10 ? "10Down" : "11Up" );


//  3-10      
//         System.out.print("a: " );    int a = stdIn.nextInt();
//         System.out.print("b: " );    int b = stdIn.nextInt();

//         int q = a - b > 0 ? a - b : b - a;
//         System.out.println(q);
     }
 }