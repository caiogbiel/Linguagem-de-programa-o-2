package com.mycompany.hospital;
public class Consulta 
{
    Paciente paciente;
    Medico medico;
    int dataAgendada;

    public Consulta(Paciente paciente, Medico medico, int dataAgendada) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataAgendada = dataAgendada;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public int getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(int dataAgendada) {
        this.dataAgendada = dataAgendada;
    }
}
