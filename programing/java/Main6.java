import java. util.Scanner;

class Main6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a: ");
        int a = stdIn.nextInt();
        stdIn.close();

        if ( a % 3 == 0 && a > 0)
            System.out.println("이 값은 3으로 나누어집니다.");
        else if ( a % 3 == 2 && a > 0)
            System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
        else if ( a % 3 == 1 && a > 0)
            System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
        else
            System.out.println("양수가 아닌 값을 입력했습니다.");
        
    }
}        
//코멘트 