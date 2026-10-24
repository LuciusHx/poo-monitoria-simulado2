import model.Assinatura;
import model.Cliente;
import model.ClienteVip;
import model.Produto;
import model.ProdutoDigital;
import model.ProdutoFisico;
import pagamento.PagamentoCartao;
import pagamento.PagamentoPix;

class Main {
    public static void main(String[] args){
        ClienteVip cliente = new ClienteVip("lucius", "123456", "lc@gmail.com", "rua", 0.20);
        System.out.println(cliente);

        Cliente c2 = new Cliente("luis", "123333", "luis123@gmail", "avenida");
        System.out.println(c2);

        Produto p1 = new ProdutoFisico(1, "Teclado", 100.0, 5, 0.8, "62360-000");
        System.out.println(p1.exibirResumo());
        System.out.println(p1);

        Produto teclado = new ProdutoFisico(12, "teclado", 100.0, 2, 2.0,"2342356");
        Produto ebook = new ProdutoDigital(3, "E-book Java", 50.0, 999, 12);
        Produto streaming = new Assinatura(122, "Streaming", 20.0, 999, 6);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionar(teclado);
        carrinho.adicionar(ebook);
        carrinho.adicionar(streaming);

        Pedido pedido = new Pedido(cliente, carrinho);

        System.out.println("--- Tentativa 1: Pix ---");
        pedido.finalizar(new PagamentoPix());

        System.out.println("--- Tentativa 2: Cartão em 6x, limite baixo ---");
        pedido.finalizar(new PagamentoCartao(6, 50.0));

        System.out.println(cliente);
    }
}