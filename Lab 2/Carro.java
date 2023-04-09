import java.util.ArrayList;
import java.util.*;

public class Carro {
    public String modelo;
    public String placa;

    private ArrayList<Multa> multas = new ArrayList();

    public void setPlaca(String placa) {
        if (placa.length() != 7) {
            placa = "Inválida";
        }

        this.placa = placa;
    }

    public void aplicarMulta(Multa multa) {
        multas.add(multa);
    }

    public Multa[] getMultas() {
        return this.multas.toArray(new Multa[0]);
    }

}
