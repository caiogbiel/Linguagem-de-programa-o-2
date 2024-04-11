package com.mycompany.hospital;
public class Hospital {

    public static void main(String[] args) {
        // Criando médicos
        Medico medico1 = new Medico("Clínico Geral", "CRM123", new Paciente[10], new boolean[30], "Dr. João", "12345678900");
        Medico medico2 = new Medico("Pediatra", "CRM456", new Paciente[10], new boolean[30], "Dra. Maria", "98765432100");
        Medico medico3 = new Medico("Cardiologista", "CRM789", new Paciente[10], new boolean[30], "Dr. Carlos", "55555555555");
        Medico medico4 = new Medico("Oftalmologista", "CRM101", new Paciente[10], new boolean[30], "Dra. Ana", "44444444444");
        Medico medico5 = new Medico("Dermatologista", "CRM202", new Paciente[10], new boolean[30], "Dr. Pedro", "33333333333");
        
        // Criando pacientes
        Paciente paciente1 = new Paciente(true, new String[10], new Medico[10], "Fulano", "11122233344");
        Paciente paciente2 = new Paciente(false, new String[10], new Medico[10], "Ciclano", "22233344455");
        Paciente paciente3 = new Paciente(true, new String[10], new Medico[10], "Beltrano", "33344455566");
        Paciente paciente4 = new Paciente(false, new String[10], new Medico[10], "Maria", "44455566677");
        Paciente paciente5 = new Paciente(true, new String[10], new Medico[10], "João", "55566677788");
        
        // Criando gerenciador
        Gerenciador gerenciador = new Gerenciador();
        
        // Agendando consultas
        gerenciador.cadastrarConsulta(medico1, paciente1, 10);
        gerenciador.cadastrarConsulta(medico2, paciente2, 15);
        gerenciador.cadastrarConsulta(medico3, paciente3, 20);
        gerenciador.cadastrarConsulta(medico4, paciente4, 25);
        gerenciador.cadastrarConsulta(medico5, paciente5, 30);
        
        // Listando todas as consultas
        gerenciador.listarConsultasTodas();
    }
}
