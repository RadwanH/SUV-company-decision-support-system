import java.io.*;

public class FirstMethod {
    private static  double a= 0.2;
    static Ft gess=new Ft();

    public static Ft calculation() throws IOException {

        //Formula : Ft+1 = 𝛼 Dt + (1- 𝛼)Ft
        // 300 is accepted as a forecast 1 (F1).
        // f1 , f2 ,f3 aylardır tahminler

        gess.insert(300,0);
        int f=0;
        for (int i = 0; i<24; i++){
            f=(int) (a*Home.data1()[i]+(1-a)*gess.getByPosition(0).getName());
            gess.insert(f);
        }
        return gess;
    }

    public static double error() throws IOException {
        return Mse.Mse(gess,Home.data1());
    }
}
