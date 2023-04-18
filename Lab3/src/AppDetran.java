import java.sql.SQLOutput;
import java.math.*;
import java.util.Iterator;

public class AppDetran {
    public Proprietario criarProprietario() {
        String nomes[] = {
                "Gabriel",
                "Gabrielly",
                "Emily",
                "Clara",
                "Ítalo"
        };
        int indiceSorteio =(int) (Math.random() * nomes.length);
        Proprietario proprietario = new Proprietario(nomes[indiceSorteio]);
        proprietario.setCNH("ES" + ((int)(Math.random() * 999999999) + 100000000));

        return proprietario;
    }
    public Carro criarCarroRandomico() {
        String modelos[] = {
                "FiatUno",
                "Onix",
                "Mustang"
        };

        int indiceSorteio =(int) (Math.random() * modelos.length);
        String placa = GeradorPlaca.getPlaca();
        Carro carro = new Carro(modelos[indiceSorteio], placa);

        return carro;
     }

    public Multa criarMulta() {
        String multas[] = {
                "Barberagem",
                "Alta velocidade",
                "Estacionar em local proibido"
        };

        int indiceSorteio =(int) (Math.random() * multas.length);
        int valor = ((int)(Math.random() * 200) + 50);
        Multa multa = new Multa(multas[indiceSorteio], valor);

        return multa;
    }

    public static void main(String args[]) {
        AppDetran detran = new AppDetran();
        for (int i = 0; i < 3; i++) {
            Proprietario proprietario = detran.criarProprietario();
            for (int j = 0; j < 2; j++) {
                Carro carro = detran.criarCarroRandomico();
                proprietario.addCarro(carro);
                if (Math.random() > 0.5) {
                    Multa multa = detran.criarMulta();
                    carro.aplicarMulta(multa);
                }
                proprietario.listarCarros();
            }
        }
    }
}
