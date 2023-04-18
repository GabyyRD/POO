import java.util.Random;
public class GeradorPlaca {
    static int num = 0;
    public static String getPlaca() {
        String letra = "";

        Random sorteia = new Random();
        for(int i = 0; i < 3; i++) {
            letra += (char)(sorteia.nextInt(26) + 'A');
        }
        letra += "-" + sorteia.nextInt(10);
        letra += (char)(sorteia.nextInt(26) + 'A');
        letra += String.format("%03d", num++);

        return letra;
    }
}
