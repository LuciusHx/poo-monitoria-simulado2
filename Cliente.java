public class Cliente extends Pessoa{
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String nome, String cpf, String email, String endereco){
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = 0;
    }

    public void adicionarPontos(int pontos){
        this.pontosFidelidade += pontos;
    }

    public int getPontosFidelidade(){
        return this.pontosFidelidade;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return String.format("%s | Endereço: %s | Pontos de Fidelidade: %d", super.toString(), endereco, pontosFidelidade);
    }
}
