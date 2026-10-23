package pagamento;

import interfaces.Pagamento;

public class PagamentoCartao implements Pagamento{
    private int parcelas;

    public PagamentoCartao(int parcelas){
        this.parcelas = parcelas;
    }

    @Override 
    public double calcularValorFinal(double valores){
        if(this.parcelas <= 3){
            return valores;
        }
        return valores += (valores*(8.0/100));
    }

    @Override 
    public String getDescricao(){
        return "Cartão";
    }
}
