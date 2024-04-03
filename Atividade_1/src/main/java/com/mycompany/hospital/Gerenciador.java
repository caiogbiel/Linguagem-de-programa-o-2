package com.mycompany.hospital;
public class Gerenciador 
{
    private Medico[] medicos;
    private Paciente[] pacientes;
    private Consulta[] consultas;

    public Gerenciador()
    {
        this.medicos = new Medico[10];
        this.pacientes = new Paciente[10];
        this.consultas = new Consulta[100];
    }
    
    public boolean cadastrarConsulta(Medico medico, Paciente paciente, int dia)
    {
        boolean medicoAtendePaciente = false;
        for(Paciente p : medico.getPacientesAtendidos())
        {
            if(p == paciente)
            {
                medicoAtendePaciente = true;
                break;
            }
        }
        if(!medicoAtendePaciente)
        {
            return false;
        }
        
        if(medico.getConsultasAgendadas()[dia - 1])
        {
            return false;
        }
        
        for(int i = 0; i < consultas.length; i++)
        {
            if(consultas[i] == null)
            {
                consultas[i] = new Consulta(paciente, medico, dia);
                medico.getConsultasAgendadas()[dia -1] = true;
                return true;
            }
        }
        return false;
    }
    
    public boolean excluirConsulta(Medico medico, Paciente paciente, int dia)
    {
        boolean medicoAtendePaciente = false;
        
        for(Paciente p : medico.getPacientesAtendidos())
        {
            if(p == paciente)
            {
                medicoAtendePaciente = true;
                break;
            }
        }
        if(!medicoAtendePaciente)
        {
            return false;
        }
        if(!medico.getConsultasAgendadas()[dia -1])
        {
            return false;
        }
        for(int i = 0; i < consultas.length; i++)
        {
            if(consultas[i] != null && consultas[i].getMedico() == medico && consultas[i].getPaciente() == paciente && consultas[i].getDataAgendada() == dia)
            {
                consultas[i] = null;
                medico.getConsultasAgendadas()[dia -1] = false;
                return true;
            }
        }
        return false;
    }
    
    public void listarConsultasPorMedico(Medico medico)
    {
        System.out.println("Consultas do medico: " + medico.getNome());
        for(Consulta consulta: consultas)
        {
            if(consulta != null && consulta.getMedico() == medico)
            {
                System.out.println("Paciente: " + consulta.getPaciente().getNome() + "Dia: " + consulta.getDataAgendada());
            }
        }
    }
    
    public void listarConsultasTodas()
    {
        System.out.println("Lista de consultas: ");
        for(Consulta consulta: consultas)
        {
            if(consulta != null)
            {
                System.out.println("Medico: " + consulta.getMedico() + ", Paciente: " + consulta.getPaciente() + ", Dia: " + consulta.getDataAgendada());
            }
        }
    }
}
