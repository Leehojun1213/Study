import java. util.Scanner;

class Main7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
         
     System.out.print("a: ");
        int a = stdIn.nextInt();
        stdIn.close();

        if ( a % 10 == 0 && a >= 0)
            System.out.println("이 값은 10의 배수입니다.");
        else if ( a % 10 != 0 && a >= 0)
            System.out.println("이 값은 10의 배수가 아닙니다.");
        else
            System.out.println("양수가 아닌 값을 입력했습니다.");
    }
}
