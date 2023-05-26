import java.util.Random;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("q의 값 : ");
        int q =stdIn.nextInt();

        int w = -5 + rand.nextInt(11);

        System.out.println("생성한 난수는" + (q + w) + "입니다");
    }
}