package model;

public class Assinatura extends Produto {
    private int meses;

    public Assinatura(int codigo, String nome, double precoBase, int estoque, int meses){
        super(codigo, nome, precoBase, estoque);
        this.meses = meses;
    }

    @Override 
    public double calcularPrecoFinal(){
        double precoFinal = super.getPrecoBase() * this.meses;
        
        if(meses >= 6){
            precoFinal -= (precoFinal*0.10);
        }
        
        return precoFinal;
    }

    public void setMeses(int meses){
        this.meses = meses;
    }

    public int getMeses(){
        return this.meses;
    }
}
