package com.mycompany.hospital;
public class Hospital {

    public static void main(String[] args) {
       // Criando médicos
        Medico medico1 = new Medico("Dr. João", "12345678900", "Clínico Geral", "CRM123");
        Medico medico2 = new Medico("Dra. Maria", "98765432100", "Pediatra", "CRM456");
        // Criando pacientes
        Paciente paciente1 = new Paciente("Fulano", "11122233344", true);
        Paciente paciente2 = new Paciente("Ciclano", "22233344455", false);
        // Criando gerenciador
        Gerenciador gerenciador = new Gerenciador();
        // Agendando consultas
        gerenciador.cadastrarConsulta(medico1, paciente1, 10);
        gerenciador.cadastrarConsulta(medico2, paciente2, 15);
        // Listando consultas
        gerenciador.listarConsultasTodas();
    }
}
