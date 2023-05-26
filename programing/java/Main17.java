import java.util.Scanner;
import java.util.Random;

class Main17{
    public static void main(String [] args){
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    System.out.println("요소수?");
    int n =stdIn.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i <= n; i++){
        System.out.println("a[" + i + "] = ");
        a[i] = stdIn.nextInt();
    }
    for
       
    /*int n;
    do {
      System.out.print("요소 수: ");
      n = stdIn.nextInt();
    } while (n > 10);
    int[] a = new int[n];
    
    //a[0] = 1 + rand.nextInt(10);
		
	// int imsi = 0;
	int j;
	for (int i = 0; i<n; i++) {
        do{
            a[i] = 1 + rand.nextInt(10);
                for(j = 0; j <= i; j++) {
                    if(a[i]==a[j]){
                        break;
                     }
                }
        }while(j<i);
    }
		/*imsi = 1 + rand.nextInt(10);
		for(int j = 1; j <= i; j++) {
			if(a[j-1] == imsi) {
			i--;
			break;
	        }
		else {
			a[i] = imsi;
		    }
		}
	}*/
        // ここにかいてください。
    
    // for (int i=0; i<n; i++) {
    // System.out.println("a[" + i + "] = " + a[i]);    
    //     }
    }
}
