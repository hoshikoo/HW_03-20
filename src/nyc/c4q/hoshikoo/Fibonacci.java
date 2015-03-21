package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/16/15.
 */

import java.text.DecimalFormat;
public class Fibonacci {

    public static void main(String[] args) {
        finonacci(110);
    }

    public static void finonacci(long N){
        double F0 = 0, F1 = 1, Fn;

        // System.out.println(F0 + "\n" + F1);

        for (int i = 0; i < N; i++) {
            Fn=F0+F1;
            //System.out.println(Fn);
            F0=F1;
            F1=Fn;
        }
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println(df.format(F0));
        //System.out.println(F0);
    }
}
