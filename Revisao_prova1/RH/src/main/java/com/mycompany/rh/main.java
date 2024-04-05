package com.mycompany.rh;
import com.mycompany.rh.model.Empresa;
import com.mycompany.rh.model.Gerente;
import com.mycompany.rh.model.Programador;
public class main {
    public static void main(String[] args) 
    {
        Empresa maykonSoft = Empresa.getInstance();
        
        maykonSoft.adicionarFuncionarios(new Gerente("Filosofia", "Jorgin", "123.456.789-00", 1234,"25/05/1975"));
        maykonSoft.adicionarFuncionarios(new Gerente("Matematica", "Klebin", "132.465.798-11", 12345,"01/01/1971"));
        maykonSoft.adicionarFuncionarios(new Programador("SIGAA", "Marcin", "456.789.123-99", 123456,"17/07/1977"));
        maykonSoft.adicionarFuncionarios(new Programador("MELHOR_SITE", "Caio", "789.456.123-00", 1,"08/02/2003"));
        
        maykonSoft.exibirInfos();
        
        System.out.println("______________________________________________________________________________");
        System.out.println("\nFolha de pagamento:" + maykonSoft.calcularPagamento());
    }
}
