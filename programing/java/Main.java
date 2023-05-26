import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("밑변 : ");
        double x = stdIn.nextDouble();

        System.out.print("높이 : ");
        double y = stdIn.nextDouble();

        System.out.print("면적은 " + (x * y / 2) + "입니다");

    }
}
