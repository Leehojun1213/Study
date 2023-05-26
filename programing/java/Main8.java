import java. util.Scanner;

class Main8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); 
        
    System.out.print("a: ");
        int a = stdIn.nextInt();
        stdIn.close();

        if ( a % 5 == 0 && a >= 0)
            System.out.println("이 값은 5로 나누어집니다.");
        else if ( a % 5 != 0 && a >= 0)
            System.out.println("이 값은 5로 나누어지지 않습니다.");
        else
            System.out.println("양수가 아닌 값을 입력했습니다.");
    }
}