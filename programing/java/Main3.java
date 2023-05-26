import java.util.Random;
class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int q = 1 + rand.nextInt(9);
        int w = -1 - rand.nextInt(9);
        int e = 10 + rand.nextInt(90);


        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
    }
}