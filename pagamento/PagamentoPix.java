package pagamento;

import interfaces.Pagamento;

public class PagamentoPix implements Pagamento{
    @Override 
    public double calcularValorFinal(double valor){
        double valorFinal = valor - (valor*0.05);
        return valorFinal;
    }

    @Override 
    public String getDescricao(){
        return "Pix";
    }
}
