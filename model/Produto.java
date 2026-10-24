package model;

public abstract class Produto {
    private final int codigo;
    private String nome;
    private double precoBase;
    private int estoque;

    public Produto(int codigo, String nome, double precoBase, int estoque){
        if (precoBase < 0) {
            throw new IllegalArgumentException("Preço base não pode ser negativo.");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;    
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }

    public double getPrecoBase(){
        return this.precoBase;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public int getEstoque(){
        return this.estoque;
    }

    public abstract double calcularPrecoFinal();

    public String exibirResumo(){
        return String.format("%d - %s: R$ %.2f", this.codigo, this.nome, calcularPrecoFinal());
    }

    public void baixarEstoque(int quantidade){
        this.estoque -= quantidade;
    }

    @Override
    public String toString() {
        return String.format("Código: %d | Nome: %s | Preço Base: R$ %.2f | Estoque: %d", 
            this.codigo, this.nome, this.precoBase, this.estoque);
    }
} 
