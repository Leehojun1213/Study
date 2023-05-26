import java.util.Scanner;

class Main13{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("num: ");
        int n = stdIn.nextInt();
        System.out.println("width: ");
        int m = stdIn.nextInt();
        //int n = 13;
        
        for(i = n; i >= n/m; i++){


        //역피라미드
       /*for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++)
                System.out.print(" ");
                for(int q = 1; q <= (n-i)*2 + 1; q++)
                    System.out.print("*");
            System.out.println();*/

        // 피라미드
        /*for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--)
                System.out.print(" ");
                for(int q = 1; q <= (i-1)*2 + 1; q++)
                    System.out.print("*");
            System.out.println();*/


            //우하
        /*for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--)
                System.out.print(" ");
                for(int q = 1; q <= i; q++)
                    System.out.print("*");
            System.out.println();*/


        //우상
        /*for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++)
                System.out.print(" ");
                for(int q = n; q >= i; q--)
                    System.out.print("*");
            System.out.println();*/

            //연습
            // for(int i = 1; i <= n; i++){
            //     for(int j = n; j >= i; j--)
                
            //     System.out.print("*");
            //     System.out.print(" ");
            //     System.out.println(); 
                

            //좌상
        /*for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--)
                System.out.print("*");
            System.out.println();*/
            
        }

    }
}