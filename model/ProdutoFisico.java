package model;

public class ProdutoFisico extends Produto{
    private double pesoKg;

    public ProdutoFisico(int codigo, String nome, double precoBase, int estoque, double pesoKg){
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
    }
    
    @Override
    public double calcularPrecoFinal() {
        double precoFinal = super.getPrecoBase() + (super.getPrecoBase() * 0.10); 
        return precoFinal;
    }

    public double getPesoKg(){
        return this.pesoKg;
    }

    public void setPesoKg(double pesoKg){
        this.pesoKg = pesoKg;
    }
}
