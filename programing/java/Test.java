import java.util.Scanner;
import java.util.Random;


public class Test {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner (System.in);
        Random rand = new Random ();

        int R = rand.nextInt(3);
        int E = rand.nextInt(3);
        int a = rand.nextInt();
        int b = rand.nextInt();
        int c = rand.nextInt();

        System.out.print("a: " + a + ", ");
        System.out.print("b: " + b + ", ");
        System.out.println("c: " + c + " ");
        System.out.println("*Rock Paper Scissors");
        switch (R) {
         case 0: System.out.println("gawi"); break;
         case 1: System.out.println("bawi"); break;
         case 2: System.out.println("bo"); break;       
        }

        switch (E) {
            case 0: System.out.println("gawi"); break;
            case 1: System.out.println("bawi"); break;
            case 2: System.out.println("bo"); break;       
           }
        System.out.println("*3-16");
        
         if ( a > b){
             int q = a;
             a = b;
             b = q;

         }if (a > c){
                 int e = a;
                 a = c;
                 c = e;
        
         }if (b > c){
             int w = b;
             b = c;
             c = w;
         }
     System.out.println("(Descending)");
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);



    
 //3 -11
 System.out.println("*3-11");
 System.out.println(a - b <= 10 && b - a <= 10 ? "10Down" : "11Up" );
 System.out.println("*3-10");


//  3-10      

         int q = a - b > 0 ? a - b : b - a;
         System.out.println(q);
     }
 }