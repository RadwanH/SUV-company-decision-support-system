import java.io.IOException;

public class ThirdMethod {

    static Ft gess = new Ft();

    public static Ft calculation() throws IOException {

        int[] xy = new int[24];
        int[] xx = new int[24];

        int xytoplam = 0;
        for (int i = 0; i < 24; i++) {
            xy[i] = Home.data1()[i] * (i + 1);
            xytoplam = xytoplam + xy[i];
        }


        int xxtoplam = 0;
        for (int i = 0; i < 24; i++) {
            xx[i] = (i + 1) * (i + 1);
            xxtoplam = xxtoplam + xx[i];
        }

        double ytoplam = 0;
        for (int i = 0; i < 24; i++) {
            ytoplam = Home.data1()[i] + ytoplam;
        }

        int xtoplam = 0;
        for (int i = 0; i < 24; i++) {
            xtoplam = xtoplam + i + 1;
        }

        double q = (24 * xytoplam - xtoplam * ytoplam);
        double w = (24 * xxtoplam - xtoplam * xtoplam);
        double b = q / w;
        double z = ytoplam / 24;

        double aa = (z) - ((b * xtoplam) / 24);

        for (int i = 0; i < 48; i++) {
            gess.insert((int) (aa + b * (i + 1)));
        }
        return gess;
    }

    public static double error() throws IOException {
        return Mse.Mse(gess, Home.data1());
    }
}


