import model.Cliente;
import model.ClienteVip;
import model.Produto;
import model.ProdutoFisico;

class Main {
    public static void main(String[] args){
        ClienteVip cliente = new ClienteVip("lucius", "123456", "lc@gmail.com", "rua", 0.20);
        System.out.println(cliente);

        Cliente c2 = new Cliente("luis", "123333", "luis123@gmail", "avenida");
        System.out.println(c2);

        Produto p1 = new ProdutoFisico(1, "Teclado", 100.0, 5, 0.8, "62360-000");
        System.out.println(p1.exibirResumo());
        System.out.println(p1);

    }
}