public class AppDetran {
    public static void main(String args[]) {
        Carro carro = new Carro();
        carro.modelo = "Chevette";

        Proprietario dono = new Proprietario();
        dono.meuCarro = carro;
        dono.nome = "João";

        System.out.println("Carro: " + carro.modelo + ", Proprietário: " + dono.nome);
    }
}
