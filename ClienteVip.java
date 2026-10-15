public class ClienteVip extends Cliente{
    private double percentualDesconto;
    
    public ClienteVip(
        String nome, 
        String cpf, 
        String email, 
        String endereco,
        double percentualDesconto
    ){
        super(nome, cpf, email, endereco);
        
        if (percentualDesconto > 0.0 && percentualDesconto <= 1.0){
            this.percentualDesconto = percentualDesconto;
        } else {
            System.out.println("Erro ao inserir desconto.");
        }
    }

    @Override 
    public String toString(){
        return String.format("%s | VIP: %.0f", super.toString(),  this.percentualDesconto*100);

    }

    public void setPercentualDesconto(double percentualDesconto){
        this.percentualDesconto = percentualDesconto;
    }
    public double getPercentualDesconto(){
        return this.percentualDesconto;
    }

}
