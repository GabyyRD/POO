import java.util.ArrayList;
import java.util.*;

public class Proprietario {
    private String nome;
    private ArrayList carros;
    public String cnh;

    public Proprietario(String nome) {
        super();
        this.nome = nome;

        carros = new ArrayList();
    }
    public Proprietario(String nome, String cnh) {
        this(nome);
        this.cnh = cnh;
    }

    public String getCNH() {
        return cnh;
    }

    public void setCNH(String cnh) {
        this.cnh = cnh;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addCarro(Carro carro) {
        this.carros.add(carro);
    }

    public void listarCarros() {
        System.out.println("\n\n+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("Proprietário: " + nome);
        System.out.println("CNH: " + cnh);
        for (Iterator iterator = carros.iterator(); iterator.hasNext();) {
            Carro carro = (Carro) iterator.next();
            System.out.println(carro);
        }

    }
}
