package model;
import interfaces.Entregavel;

public class ProdutoFisico extends Produto implements Entregavel{
    private double pesoKg;
    private String cep;

    public ProdutoFisico(int codigo, String nome, double precoBase, int estoque, double pesoKg, String cep){
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
        this.cep = cep;
    }
    
    @Override
    public double calcularPrecoFinal() {
        double precoFinal = (super.getPrecoBase() + (super.getPrecoBase() * 0.10)); 
        return precoFinal;
    }

    public double getPesoKg(){
        return this.pesoKg;
    }

    public void setPesoKg(double pesoKg){
        this.pesoKg = pesoKg;
    }

    public double calcularFrete(String cep){
        double frete = 15+(2*this.pesoKg);
        return frete;
    }

    public int prazoEntregaDias(){
        if(cep.charAt(0) == '6'){
            return 7;
        }
        return 12;
    }
}
