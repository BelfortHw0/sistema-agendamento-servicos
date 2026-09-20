Sistema de Agendamento de Serviços
Sistema desenvolvido em Java para gerenciamento de clientes, serviços e agendamentos.

Sobre o projeto
Este projeto foi desenvolvido como prática de Programação Orientada a Objetos (POO) em Java, aplicando conceitos fundamentais da linguagem na construção de um sistema de agendamento de serviços.

Funcionalidades
- Cadastro de clientes;
- Cadastro de serviços;
- Criação de agendamentos;
- Exibição das informações dos agendamentos.

Tecnologias utilizadas
- Java;
- Maven;
- JUnit 5;
- NetBeans ou outra IDE compatível com Maven.

Estrutura do projeto
O projeto segue a estrutura padrão do Maven para manter o código, os testes e os recursos separados.

- `src/main/java`: código-fonte da aplicação;
- `src/main/resources/db`: scripts do banco de dados;
- `src/test/java`: testes automatizados;
- `.github/workflows`: validação automática dos próximos commits e pull requests;
- `CONTRIBUTING.md`: orientações para branches, commits e pull requests.

Conceitos praticados
Durante o desenvolvimento foram aplicados conceitos como:
- Classes e objetos;
- Atributos e métodos;
- Encapsulamento;
- Getters e setters;
- Construtores;
- Métodos com parâmetros e retorno;
- Organização de classes.

Como executar
1. Clone o repositório:

```bash
git clone https://github.com/BelfortHw0/sistema-agendamento-servicos.git
```

2. Certifique-se de ter o JDK 26 e o Maven instalados.

3. Execute os testes:

~~~bash
mvn test
~~~

4. Gere e execute a aplicação:

~~~bash
mvn package
java -jar target/sistema-agendamento-servicos-1.0-SNAPSHOT.jar
~~~

Também é possível abrir o arquivo `pom.xml` no NetBeans e executar a classe `Main.java`.

Contribuições
Consulte o arquivo `CONTRIBUTING.md` para manter o mesmo padrão nos próximos commits e pull requests.

Status do projeto:
- Em desenvolvimento.
Novas funcionalidades e melhorias serão adicionadas conforme o projeto evolui.

Autor
- Pedro Fabiano Belfort

Projeto desenvolvido para estudos e prática de desenvolvimento de software.
