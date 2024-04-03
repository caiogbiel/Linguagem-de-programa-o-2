package com.mycompany.hospital;
public class Paciente extends Pessoa
{
    private boolean convenio;
    private String[] enfermidadesRegistradas;
    private Medico[] medicosAtendentes;

    public Paciente(boolean convenio, String[] enfermidadesRegistradas, Medico[] medicosAtendentes, String nome, String cpf) 
    {
        super(nome, cpf);
        this.convenio = convenio;
        this.enfermidadesRegistradas = enfermidadesRegistradas;
        this.medicosAtendentes = medicosAtendentes;
    }

    public boolean isConvenio() {
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }

    public String[] getEnfermidadesRegistradas() {
        return enfermidadesRegistradas;
    }

    public void setEnfermidadesRegistradas(String[] enfermidadesRegistradas) {
        this.enfermidadesRegistradas = enfermidadesRegistradas;
    }

    public Medico[] getMedicosAtendentes() {
        return medicosAtendentes;
    }

    public void setMedicosAtendentes(Medico[] medicosAtendentes) {
        this.medicosAtendentes = medicosAtendentes;
    }
}
