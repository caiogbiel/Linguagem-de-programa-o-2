package com.mycompany.hospital;
public class Medico extends Pessoa
{
    private String especialidade;
    private String CRM;
    private Paciente[] pacientesAtendidos;
    private boolean[] consultasAgendadas;
    

    public Medico(String especialidade, String CRM, Paciente[] pacientesAtendidos, boolean[] consultasAgendadas, String nome, String cpf) 
    {
        super(nome, cpf);
        this.especialidade = especialidade;
        this.CRM = CRM;
        this.pacientesAtendidos = new Paciente[10];
        this.consultasAgendadas = new boolean[30];
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public Paciente[] getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void setPacientesAtendidos(Paciente[] pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public boolean[] getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void setConsultasAgendadas(boolean[] consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }
    
}
