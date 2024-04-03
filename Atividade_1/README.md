# Atividade prática 01 - LP2

O setor de atendimento de um famoso hospital deseja implementar um sistema de gerenciamento de consultas, que envolva médicos e pacientes.

O médico deve ter possuir os seguintes atributos:
<ol>
<li>● String nome;</li>
<li>● String CPF;</li>
<li>● String especialidade;</li>
<li>● String CRM;</li>
<li>● Pacientes[10] PacientesAtendidos (vetor de Paciente)</li>
<li>● boolean[30] consultasAgendadas ( com 30 posicões booleanas - 1 para
cada dia do mês, inicialmente false )</li>
</ol>

O paciente deve ter possuir os seguintes atributos:
<ol>
<li>● String nome;</li>
<li>● String CPF ;</li>
<li>● boolean convênio;</li>
<li>● String[10] EnfermidadesRegistradas</li>
<li>● Medico[10] medicosAtendentes</li>
</ol>

Crie uma classe chamada “Consulta” com os seguintes atributos:
<ol>
<li>● Paciente paciente</li>
<li>● Médico médico</li>
<li>● int dataAgendada</li>
</ol>

Crie uma classe chamada “Gerenciador” com os seguintes atributos e métodos.
<ol>
<li>● Medico[10] medicos</li>
<li>● Paciente[10] pacientes</li>
<li>● Consulta[100] consultas</li>
<li>● boolean cadastrarConsulta(medico, paciente, dia) Verifique se o médico atende esse paciente e se o dia esta livre. (retorne true caso tudo esteja ok)</li>
<li>● boolean excluirConsulta(medico, paciente, dia) Verifique se o médico atende esse paciente e se o dia esta livre. (retorne true caso tudo esteja ok)</li>
<li>● void listarConsultasPorMedico()</li>
<li>● void listarConsultasTodas()</li>
</ol>
obs:
<ol>
<li>● Implemente a herança para atributos comuns a ambas classes (classe
Pessoa)</li>
<li>● Implementação encapsulamento (modificadores de acesso, métodos
get/set), construtores (com e sem parâmetros)</li>
</ol>

Crie 5 médicos, 5 pacientes e 5 agendamentos na classes Main;
