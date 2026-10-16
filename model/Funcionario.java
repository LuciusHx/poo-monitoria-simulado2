package model;
public class Funcionario extends Pessoa {
    private final int matricula;
    private double salario;

    public Funcionario(String nome, String cpf, String email, int matricula, double salario){
        super(nome, cpf, email);
        if (matricula <= 0) {
            throw new IllegalArgumentException("Matrícula inválida.");
        }
        
        this.matricula = matricula;

        if(salario >= 0){
            this.salario = salario;
        }
    }

    public void setSalario(double salario){
        if(salario >= 0){
            this.salario = salario;
        }
    }
}
