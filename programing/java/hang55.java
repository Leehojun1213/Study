import java.util.Random;
class hang55 {
	// static int search(int[][] a) {
    //     int b = 1;
    //     int key = 0;
    //     for (int i = 0; i < a.length; i++){
    //         for (int k = 0; k <= i; k++){
    //             key = a[i][k];
    //             if (key == a[i][k+1])
    //             {
    //                 key = a[i][k] = rand.nextInt((b+15)-b)+b;
    //                 k--;
    //             }
    //             else
    //             {
    //                 a[i][k]=key;
    //             }
    //         }
    //     }
		
	// }

	public static void main(String[] args) {
		Random rand = new Random();
		int b = 1;
		int[][] a = new int[5][5];
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < 5; k++) {
                a[i][k] = rand.nextInt((b+15)-b)+b;
                    for(int j = 0; j < k; j++){
                        if(a[i][k] == a[i][j])
                        k--;
                    }
		    }
			//System.out.println(b);
			b += 15;
			//System.out.println(b);	
			
		}
        for(int i=0;i<5;i++){
            for(int k=0;k<5;k++){
            System.out.print(a[i][k]);
            System.out.print("\t");
            }
            System.out.println();
        }    
		
	}
	
}