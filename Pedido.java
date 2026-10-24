import exceptions.PagamentoRecusadoException;
import interfaces.Pagamento;
import model.Cliente;
import model.ClienteVip;

public class Pedido {
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void finalizar(Pagamento pagamento) {
        try {
            
            double subtotal = carrinho.calcularTotal()
                            + carrinho.calcularFreteTotal(cliente.getEndereco());

            
            if (cliente instanceof ClienteVip) {
                double desconto = ((ClienteVip) cliente).getPercentualDesconto();
                subtotal -= subtotal * desconto;
            }

        
            double valorFinal = pagamento.calcularValorFinal(subtotal);
            pagamento.exibirComprovante(subtotal);

            
            cliente.adicionarPontos((int) (valorFinal / 10));
        } catch (PagamentoRecusadoException e) {
            System.out.println("Pagamento recusado");
        } finally {
            System.out.println("Pedido encerrado");
        }
    }
}