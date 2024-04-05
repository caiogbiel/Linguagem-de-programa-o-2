package com.mycompany.rh.model;
public class Gerente extends Funcionario
{
    private String departamento;

    public Gerente(String departamento, String nome, String cpf, int matricula, String dataNascimento) {
        super(nome, cpf, matricula, dataNascimento);
        this.departamento = departamento;
    }
    @Override
    public double calculaSalario() {
        return salarioMinimo * 5.0;
    }

    @Override
    public void exibirInfo() 
    {
        String info0 = "______________________________________________________________________________\n";
        String info1 = "Nome: " + this.nome + "\ncpf: " + this.cpf + "\nData nascimento: " + this.dataNascimento;
        String info2 = "\nDepartamento: " + this.departamento + "\nSalario: " + this.calculaSalario();
        System.out.println(info0 + info1 + info2);
    }
    
    
}
