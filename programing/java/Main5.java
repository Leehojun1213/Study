import java. util.Scanner;

class Main5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); 

        //3-8
        
        System.out.print("a: ");
        int a = stdIn.nextInt();
        stdIn.close();

        if (a >= 80 && a <= 100)
        System.out.println("우수");
        else if (a >= 70)
            System.out.println("양호");
        else if (a >= 60)
            System.out.println("보통");
        else if (a >= 0)
            System.out.println("낙제");
        else
            System.out.println("0부터 100사이의 숫자를 입력하세요.");
        
        
        
        /*if ( a >= 0 && a <= 59)
            System.out.println("낙제");
        else if (a >= 60 && a <= 69)
            System.out.println("보통");
        else if (a >= 70 && a <= 79)
            System.out.println("양호");
        else if (a >= 80 && a <= 100)
            System.out.println("우수");
        else
            System.out.println("0부터 100사이의 숫자를 입력하세요.");*/
        

       // 3-7
        /*System.out.print("a: ");
        int a = stdIn.nextInt();
        stdIn.close();

        if ( a % 3 == 0 && a >= 0)
            System.out.println("이 값은 3으로 나누어집니다.");
        else if ( a % 3 == 2 && a >= 0)
            System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
        else if ( a % 3 == 1 && a >= 0)
            System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
        else
            System.out.println("양수가 아닌 값을 입력했습니다.");*/

       
       // 3-6
        /*System.out.print("a: ");
        int a = stdIn.nextInt();
        stdIn.close();

        if ( a % 10 == 0 && a >= 0)
            System.out.println("이 값은 10의 배수입니다.");
        else if ( a % 10 != 0 && a >= 0)
            System.out.println("이 값은 10의 배수가 아닙니다.");
        else
            System.out.println("양수가 아닌 값을 입력했습니다.");*/

        
        // 3-5
        /*System.out.print("a: ");
        int a = stdIn.nextInt();
        stdIn.close();

        if ( a % 5 == 0 && a >= 0)
            System.out.println("이 값은 5로 나누어집니다.");
        else if ( a % 5 != 0 && a >= 0)
            System.out.println("이 값은 5로 나누어지지 않습니다.");
        else
            System.out.println("양수가 아닌 값을 입력했습니다.");*/


       
       // 3-4
        /* System.out.print("a: ");
        int a = stdIn.nextInt();

        System.out.print("b: ");
        int b = stdIn.nextInt();
        stdIn.close();

        if (a > b)
            System.out.println("a가 큽니다");
        else if (a< b)
            System.out.println("b가 큽니다");
        else
            System.out.println("a와b는 같은 값입니다");*/

        /*System.out.print("몇월입니까: ");
        int month = stdIn.nextInt();
        stdIn.close();

        if (month >= 3 && month <= 5)
            System.out.println("봄입니다");
        else if (month >= 6 && month<= 8)
            System.out.println("여름입니다");
        else if (month >= 9 && month <= 11)
            System.out.println("가을입니다");
        else if (month == 12 || month == 1 || month == 2)
            System.out.println("겨울입니다");*/

        /*System.out.print("값의수치: ");
        int n = stdIn.nextInt();

        if (n <= -10 || n >= 10)
            System.out.println("숫자는 두자리 수 이상");
        else
            System.out.println("두자리 수 미만");*/



        /*if (n == 0)
            System.out.println("0입니다.");
        else if (n >= -9 && n <= 9)
            System.out.println("한자리 수입니다.");
        else
            System.out.println("두자리 수 이상입니다");*/
        
        /*if (n <= 0)
            System.out.println("아바바바바바");
        else
            if (n % 2 == 0)
                System.out.println("그 값은 짝수입니다");
            else
                System.out.println("그 값은 홀수입니다");*/
        

           /* if (n > 0)
            if (n % 2 == 0)
                System.out.println("그 값은 짝수입니다");
            else
                System.out.println("그 값은 홀수입니다");
        else
            System.out.println("아바바바바바");*/



        /*if (n > 0)
            System.out.println("그 값는 정수입니다.");
        else if (n < 0)
            System.out.println("그 값는 음수입니다.");
        else
            System.out.println("그 값은 0입니다.");*/
        /*System.out.print("a: "); int a = stdIn.nextInt();
        System.out.print("b: "); int b = stdIn.nextInt();

        if (a == b)
            System.out.println("2개의 수치는 뭐시기");
        else
            System.out.println("2개의 수치는 뭐시기2");*/

        /*System.out.print("정수값");
        int n = stdIn.nextInt();
        stdIn.close();

        if (n > 0)
            System.out.println("그값은 타다시입니다.");
        else
            System.out.println("그값은0또는후입니다");*/

        


    }
}