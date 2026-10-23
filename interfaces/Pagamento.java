package interfaces;

public interface Pagamento {
    public double calcularValorFinal(double valor);
    public String getDescricao();
    public default void exibirComprovante(double valor){
        System.out.println(String.format("Pago via %s: R$ %.2f", getDescricao(), calcularValorFinal(valor))); 
    }
}
