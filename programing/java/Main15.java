import java.util.Random;
import java.util.Scanner;

class Main15{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("su: ");
        int n = scan.nextInt();
        int [] b = new int[n];

        for(int i=0; i<n; i++)
            b[i] = 1 + rand.nextInt(10);

        for (int i=10; i>=1; i--){
            for(int j=0; j< n; j++) {
                if(b[j] >=i){
                System.out.print("* ");
            } else{
                System.out.print("  ");
            }
        }
        System.out.println();
        }
        for (int i=0; i<n; i++) {
            System.out.print("--");
        }
        System.out.println();

        for (int i=0; i<n; i++) {
            System.out.print(1 + i%10 + " ");
        } 
    }
}

