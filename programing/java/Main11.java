import java.util.Scanner;

class Main11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;
        int y=0;
        System.out.println("integer? ");    
        x = stdIn.nextInt();

        if  ( x < 0) {
        System.out.println("retry");
        } else {
        while (x != 0){
            y++;
            x/= 10;
        }
        System.out.print("jarisunun" + y);
    }
        
    }
        
}