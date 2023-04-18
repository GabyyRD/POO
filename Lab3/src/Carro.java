import java.util.ArrayList;
import java.util.*;

public class Carro {
    public String modelo;
    public String placa;

    private ArrayList<Multa> multas = new ArrayList();

    public Carro(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    public void aplicarMulta(Multa multa) {
        multas.add(multa);
    }

    public Multa[] getMultas() {
        return this.multas.toArray(new Multa[0]);
    }

    @Override
    public String toString() {
        String retorno = "Carro \nmodelo: " + modelo + ", \nplaca: " + placa;

        if(multas.size() >0) retorno+= ", \nmultas: ";

        for (Iterator iterator = multas.iterator(); iterator.hasNext();) {
            Multa multa = (Multa) iterator.next();
            retorno+= "\n * " + multa.infracao + " R$" + multa.valor;
        }

        return retorno;
    }
}
