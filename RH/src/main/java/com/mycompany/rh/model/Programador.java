package com.mycompany.rh.model;
public class Programador extends Funcionario
{
    private String projetoAssociado;

    public Programador(String projetoAssociado, String nome, String cpf, int matricula, String dataNascimento) {
        super(nome, cpf, matricula, dataNascimento);
        this.projetoAssociado = projetoAssociado;
    }

    @Override
    public double calculaSalario() {
        return salarioMinimo * 8.0;
    }

    @Override
    public void exibirInfo() 
    {
        String info0 = "______________________________________________________________________________\n";
        String info1 = "Nome: " + this.nome + "\ncpf: " + this.cpf + "\nData nascimento: " + this.dataNascimento;
        String info2 = "\nProjeto associado: " + this.projetoAssociado + "\nSalario: " + this.calculaSalario();
        System.out.println(info0 + info1 + info2);
    }
    
    
}
