package com.mycompany.rh.model;
public abstract class Funcionario 
{
    protected String nome;
    protected String cpf;
    protected int matricula;
    protected String dataNascimento;
    
    public Funcionario(String nome, String cpf, int matricula, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
 
    public abstract double calculaSalario();
    public abstract void exibirInfo();
    
    public static double salarioMinimo = 1412.00;
}
