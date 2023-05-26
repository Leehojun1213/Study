import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("의 값 : ");
        double x = stdIn.nextDouble();

        System.out.print("y의 값 : ");
        double y = stdIn.nextDouble();

        System.out.println("합계는 " + x + y + "입니다");
        System.out.println("평균는 " + (x + y) / 2 + "입니다");

    }
}
