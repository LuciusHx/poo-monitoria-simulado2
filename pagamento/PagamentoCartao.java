package pagamento;

import exceptions.PagamentoRecusadoException;
import interfaces.Pagamento;

public class PagamentoCartao implements Pagamento {
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite) {
        this.parcelas = parcelas;
        this.limite = limite;
    }

    @Override
    public double calcularValorFinal(double valor) {
        double valorFinal = valor;
        if (parcelas > 3) {
            valorFinal = valor * 1.08;
        }
        if (valorFinal > limite) {
            throw new PagamentoRecusadoException("Valor acima do limite do cartão");
        }
        return valorFinal;
    }

    @Override
    public String getDescricao() {
        return "Cartão";
    }
}