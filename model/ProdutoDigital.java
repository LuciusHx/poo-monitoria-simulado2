package model;

public class ProdutoDigital extends Produto{
    private int tamanhoMB;

    public ProdutoDigital(int codigo, String nome, double precoBase, int estoque, int tamanhoMB){
        super(codigo, nome, precoBase, estoque);
        this.tamanhoMB = tamanhoMB;
    }

    @Override 
    public double calcularPrecoFinal(){
        double precoFinal = super.getPrecoBase() - (super.getPrecoBase()*0.05);
        return precoFinal;
    }

    public double gettamanhoMB(){
        return this.tamanhoMB;
    }

    public void settamanhoMB(int tamanhoMB){
        this.tamanhoMB = tamanhoMB;
    }
}
