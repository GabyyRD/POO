import java.util.ArrayList;

public class Proprietario {
    private String nome;
    private ArrayList carros;
    public String cnh;

    public Proprietario(String nome) {
        super();
        this.nome = nome;

        carros = new ArrayList();
    }

    public String getNome()
    {
        return nome;
    }

    public void addCarro(Carro carro) {

        carros.add(carro);
    }

    public Carro[] getCarros() {
        return (Carro[])carros.toArray(new Carro[carros.size()]);
    }
}
