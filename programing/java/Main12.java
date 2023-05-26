import java.util.Scanner;

class Main12 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x;
        do { 
            System.out.println("x? ");
            x = stdIn.nextInt();
        }while (x <= 0);

        int n;
        do {
            System.out.println("n?");
            n = stdIn.nextInt();
        }while (n <= 0);

        int zegop = 1;
        int i = 1;

        while (i <= n) {
        
        zegop *= x;
        i++;
        }
        System.out.println("x" + "n" + "=" + zegop);
    }
}