package com.mycompany.rh.model;
import java.util.ArrayList;
public class Empresa 
{
    ArrayList<Funcionario> funcionarios;
    private static Empresa maykonSoft;
    
    private Empresa()
    {
        funcionarios = new ArrayList<>();
    }
    
    //Padrao singleton
    public static Empresa getInstance()
    {
        if(maykonSoft == null)
        {
            maykonSoft = new Empresa();
        }
        return maykonSoft;
    }
    
       public void adicionarFuncionarios(Funcionario funcionario)
    {
        funcionarios.add(funcionario);
    }
       public double calcularPagamento()
       {
           double folhaPagamento = 0;
           for(Funcionario funcionario : funcionarios)
           {
               folhaPagamento += funcionario.calculaSalario();
           }
           return folhaPagamento;
       }
       public void exibirInfos()
       {
           for(Funcionario funcionario : funcionarios)
           {
           funcionario.exibirInfo();
           }
       }
}
    
 
