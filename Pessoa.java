public class Pessoa {
    private String nome;
    private final String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + " | " +"CPF: " + this.cpf;
    } 

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){
        return this.cpf;
    }
}
