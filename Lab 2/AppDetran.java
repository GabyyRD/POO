import java.sql.SQLOutput;

public class AppDetran {
    public static void main(String args[]) {
        AppDetran detran = new AppDetran();

        Carro fiatUno = new Carro();
        fiatUno.modelo = "1.5 Turbo";
        fiatUno.placa = "ABCD1234";
        fiatUno.setPlaca(fiatUno.placa);

        Carro fiatUnoT = new Carro();
        fiatUnoT.modelo = "1.6 Turbo";
        fiatUnoT.placa = "EFG1234";
        fiatUnoT.setPlaca(fiatUnoT.placa);

        Proprietario proprietario = new Proprietario("Gabrielly");
        proprietario.cnh = "123456789";

        proprietario.addCarro(fiatUno);
        proprietario.addCarro(fiatUnoT);

        Multa multa1 = new Multa();
        multa1.infracao = "excesso de velocidade";
        multa1.valor = 100;

        Multa multa2 = new Multa();
        multa2.infracao = "Ultrapassagem faixa dupla";
        multa2.valor = 200;

        Multa multa3 = new Multa();
        multa3.infracao = "Excesso de velocidade";
        multa3.valor = 100;

        fiatUno.aplicarMulta(multa1);
        fiatUnoT.aplicarMulta(multa2);
        fiatUnoT.aplicarMulta(multa3);

        System.out.println("\nProprietário: " + proprietario.getNome());
        System.out.println("CNH: " + proprietario.cnh);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        Carro[] carros = proprietario.getCarros();
        for (Carro carro : carros) {
            System.out.println("\nModelo: " + carro.modelo + "\nPlaca: " + carro.placa);

            Multa[] multas = carro.getMultas();
            for (Multa multa : multas)
                System.out.println("Multa: " + multa.infracao + "\nValor: R$" + multa.valor);
        }


    }
}
