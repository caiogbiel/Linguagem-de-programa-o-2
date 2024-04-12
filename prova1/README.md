## Crie um sistema gerenciador de materiais de uma biblioteca

Características e funcionalidades:
● Crie uma interface chamada “Material” com o método
“exibirDetalhes()” que exibe os detalhes de um material;
● Crie as classes “Livro” e “Revista” que herdem de “Material”. As
classes devem ter os seguintes atributos e métodos:

○ Classe "Livro”
<ol>
<li>■ String titulo;</li>
<li>■ String autor;</li>
<li>■ int anoLancamento;</li>
<li>■ String edicao;</li>
<li>■ Método construtor vazio e parametrizado (polimórfico);</li>
<li>■ Métodos get/set;</li>
</ol>

○ Classe “Revista”
<ol>
<li>■ String titulo;</li>
<li>■ String editora;</li>
<li>■ int numeroPaginas;</li>
<li>■ Método construtor vazio e parametrizado (polimórfico);</li>
<li>■ Métodos get/set;</li>
</ol>

● Crie a classe BibliotecaDAO com os atributos:
<ol>
<li>○ ArrayList<Material> materiais;</li>
<li>○ private static BancoDAO banco;</li>
<li>○ Construtor privado (inicializa o ArrayList aqui)</li>
<li>○ Método getArrayMateriais();</li>
<li>○ public static BibliotecaDAO getInstance() Singleton</li>
</ol>

● Crie uma classe abstrata chamada “BibliotecaFunctions” com
métodos estáticos e atributos:
<ol>
<li>○ Instância de BibiotecaDAO;</li>
<li>○ pesquisarMaterial(String titulo) que pesquisa materiais pelo
título;</li>
<li>○ exibirListaMateriais() que exibe uma lista de materiais
disponíveis;</li>
<li>○ cadastarMaterial(3 ou 4 argumentos) que permite adicionar,
remover ou atualizar materiais na biblioteca (polimórfico -
livro ou revista);</li>
<li>○ removerMaterial() que remove um material na biblioteca;</li>
<li>○ private static Material buscaPorNome(String titulo) que
apenas busca um material pelo título e serve aos métodos
internos da classe “BibliotecaFunctions”;</li>
</ol>
