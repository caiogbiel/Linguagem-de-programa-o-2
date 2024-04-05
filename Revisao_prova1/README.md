Proposta: Criar um sistema de RH de um empresa de TI que utilize
conceitos de herança, abstração e collections

Defina uma classe abstrata Funcionario com os seguintes atributos:
<ol>
<li>● nome</li>
<li>● cpf</li>
<li>● matricula</li>
<li>● dataNascimento</li>
</ol>

Além disso, inclua métodos abstratos para calcular o salário e para
exibir informações do funcionário. Crie também o construtor dessa
classe.

Crie duas subclasses de Funcionario: Gerente e Programador. Cada
uma dessas subclasses deve implementar os métodos abstratos da
classe Funcionario de acordo com as especificidades de cada cargo.

Crie o atributo “departamento” em Gerente e “projetoAssociado” em
programador. Crie também o construtor dessas classes.

Crie uma classe Empresa que utiliza uma coleção (por exemplo,
ArrayList) para armazenar os funcionários.

Na classe Empresa, implemente métodos para adicionar funcionários,
calcular a folha de pagamento total da empresa e exibir informações de
todos os funcionários. Implemente nessa classe o padrão Singleton,
que cria uma instância única da classe Empresa.

Crie um programa principal (Main) que demonstre o funcionamento do
sistema. Instanciar objetos de diferentes tipos de funcionários (ex:
Gerente, Programador) e adicione-os à empresa. Em seguida, calcule e
exiba a folha de pagamento total da empresa e as informações de todos
os funcionários.
