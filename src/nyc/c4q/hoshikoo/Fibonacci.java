package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/16/15.
 */
public class Fibonacci {

    public static void main(String[] args) {
        finonacci(80);
    }

    public static void finonacci(long N){
        long F0 = 0, F1 = 1, Fn;

        // System.out.println(F0 + "\n" + F1);

        for (long i = 0; i < N; i++) {
            Fn=F0+F1;
            //System.out.println(Fn);
            F0=F1;
            F1=Fn;
        }
        System.out.println(F0);
    }
}
